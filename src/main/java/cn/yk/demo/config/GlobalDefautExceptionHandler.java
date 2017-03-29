package cn.yk.demo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * <br> Project: mock-server
 * <br> Package: cn.yk.demo.config
 * <br> Description: 处理Controller层的异常
 * <br> Date: Created in 9:53 2017/3/29.
 * <br> Modified By
 *
 * @author SiGen
 */
@ControllerAdvice
public class GlobalDefautExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String defaultExceptionHandler(HttpServletRequest httpServletRequest, Exception exception) {
        System.out.println("got U");
        return "/error";
    }
}
