package cn.itsource.crm.shiro.filter;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 自定义身份认证过滤器
 */
public class MyAuthenticationFilter extends FormAuthenticationFilter {

    /**
     * 允许访问的方法
     * @param request
     * @param response
     * @param mappedValue
     * @return
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        //如果是OPTIONS请求，直接放行
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String method = httpServletRequest.getMethod();
        System.out.println(method);
        if("OPTIONS".equalsIgnoreCase(method)){
            return true;
        }
        return super.isAccessAllowed(request, response, mappedValue);
    }
}