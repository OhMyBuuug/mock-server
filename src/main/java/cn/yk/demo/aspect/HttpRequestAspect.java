package cn.yk.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * <br> Project: mock-server
 * <br> Package: cn.yk.demo.aspect
 * <br> Description:
 * <br> Date: Created in 17:18 2017/3/29.
 * <br> Modified By
 *
 * @author SiGen
 */
// 面向切面的注解
@Aspect
// 引入到spring容器
@Component
public class HttpRequestAspect {
    // org.slf4j
    private final static Logger logger = LoggerFactory.getLogger(HttpRequestAspect.class);

    @Pointcut("execution(public * cn.yk.demo.controller..*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // url
        logger.info("url = {}", request.getRequestURL());
        // method
        logger.info("method = {}", request.getMethod());
        // ip
        logger.info("ip = {}", request.getRemoteAddr());
        // className
        logger.info("class-method = {}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        // param
        logger.info("params = {}", joinPoint.getArgs().toString());
    }

    @After("log()")
    public void doAfter() {
        logger.info("After");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturn(Object object) {
        logger.info("response = {} ", object.toString());
    }
}
