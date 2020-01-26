package cn.itsource.crm.web.systemLog;

import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.SystemLog;
import cn.itsource.crm.service.ISystemLogService;
import cn.itsource.crm.shiro.util.UserContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect      //声明为切面类
@Component
public class SystemLogAspect {

    @Autowired
    private ISystemLogService systemLogService;
    @Autowired
    private HttpSession session;
    @Autowired
    private HttpServletRequest request;

    @Around("execution(* cn.itsource.crm.web.*.*.*(..))")
    public Object aroundSysLog(ProceedingJoinPoint pjp) {
        try {
            //获取到切入点的签名
            Signature signature = pjp.getSignature();
            //将签名转为方法的签名
            if (signature instanceof MethodSignature) {
                MethodSignature ms = (MethodSignature) signature;
                //获取方法
                Method method = ms.getMethod();
                //获取注解(判断是否为RequestMapping类型的)
                if (method.isAnnotationPresent(RequestMapping.class)) {
                    //创建日志对象
                    SystemLog sysLog = new SystemLog();
                    //设置日志的操作方法和名称
                    sysLog.setFunction(method.getName());
                    //获取方法上的注解,设置日志的操作名称
                    RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
                    sysLog.setParams(requestMapping.name());
                    //设置日志的用户相关信息
                    Employee user = UserContext.getEmployee();
                    if (user!=null){
                        String username = user.getUsername();
                        sysLog.setOpUser(username);
                    }else {
                        sysLog.setOpUser("系统操作");
                    }
                    //设置日志的ip和时间
                    Date now = new Date();
                    //准备格式化日期
                    SimpleDateFormat f = new SimpleDateFormat( "yyyy-MM-dd  HH:mm:ss");
                    sysLog.setOpTime(f.format(now));
                    sysLog.setOpIp(request.getRemoteAddr());

                    //添加日志
                    systemLogService.save(sysLog);
                }
            }
            //获取当前切入点方法的所需参数
            Object[] args = pjp.getArgs();
            //执行方法并返回
            return pjp.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }


}
