package cn.itsource.crm.shiro.realm;

import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.mapper.EmployeeMapper;
import cn.itsource.crm.shiro.util.Md5Util;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 自定义realm   专门用来认证和授权的
 *
 * 交给spring管理的bean，在该bean内部是可以随意注入交给spring管理的bean对象
 */
public class AuthenRealm extends AuthorizingRealm {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 身份认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取用户名
        String username = (String) authenticationToken.getPrincipal();
        //通过用户名查询员工对象
        Employee employee = employeeMapper.selectByUsername(username);
        //如果员工对象为空
        if (employee == null) {
            return null;
        }
        //盐值
        ByteSource salt = ByteSource.Util.bytes(Md5Util.SALT);
        return new SimpleAuthenticationInfo(employee, employee.getPassword(), salt, getName());
    }
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}
