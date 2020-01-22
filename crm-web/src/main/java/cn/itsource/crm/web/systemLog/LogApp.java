package cn.itsource.crm.web.systemLog;

import java.lang.annotation.*;

/**
 * Aop日志的自定义注解
 */

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogApp {
    String description() default "";
    String module() default "";
    boolean doBefore() default true;

}
