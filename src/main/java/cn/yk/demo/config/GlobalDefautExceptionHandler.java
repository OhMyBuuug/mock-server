//package cn.yk.demo.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * <br> Project: mock-server
// * <br> Package: cn.yk.demo.config
// * <br> Description: 处理Controller层的异常
// * <br> Date: Created in 9:53 2017/3/29.
// * <br> Modified By
// *
// * @author SiGen
// */
//@ControllerAdvice
//public class GlobalDefautExceptionHandler {
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @ExceptionHandler(value = Exception.class)
//    public String defaultExceptionHandler(HttpServletRequest httpServletRequest, Exception exception) {
//        logger.error(exception.getMessage());
//        return "/error";
//    }
//}
