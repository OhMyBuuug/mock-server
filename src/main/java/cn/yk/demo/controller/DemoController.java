package cn.yk.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br> Project: mock-server
 * <br> Package: cn.yk.demo.controller
 * <br> Description:
 * <br> Date: Created in 9:35 2017/3/29.
 * <br> Modified By
 *
 * @author SiGen
 */
@RestController
public class DemoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/test/error")
    public Integer testError(){
        logger.error("错误");
        return 100/0;
    }
}
