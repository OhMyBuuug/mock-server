package cn.yk.demo.controller;

import cn.yk.demo.bo.Demo;
import cn.yk.demo.bo.Person;
import cn.yk.demo.bo.Result;
import cn.yk.demo.util.ResultUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

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

    @Autowired
    private Demo demo;

    // 通过从配置文件注入读取属性值
    @RequestMapping("/getDemoAge")
    public Integer getDemoAge() {
        return demo.getAge();
    }

    // 从请求的url中获取参数
    @RequestMapping(value = "/getDemoName/{id}", method = RequestMethod.GET)
    public String getDemoName(@PathVariable Integer id) {
        return demo.getName() + id;
    }

    @RequestMapping(value = "/{id}/getDemoName", method = RequestMethod.GET)
    public String getDemoNameSec(@PathVariable Integer id) {
        return demo.getName() + id;
    }

    // 从请求参数中获取参数
    @RequestMapping(value = "/getDemoName", method = RequestMethod.GET)
    public String getDemoNameTri(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        System.out.println(id);
        return demo.getName();
    }

    // 若请求参数中无"id"则报错
    @RequestMapping(value = "/getDemoNameBy", method = RequestMethod.GET)
    public String getDemoNameBy(@RequestParam("id") Integer id) {
        return demo.getName() + id;
    }

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public String getOne(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        JSONObject result = new JSONObject();

        result.put("id", id);

        return result.toJSONString();
    }

    /**
     * 添加表单验证
     * 18岁以下禁止入内
     */
    @RequestMapping(value = "/getPerson", method = RequestMethod.GET)
    public Result<Person> getPerson(@Valid Person person, BindingResult bindingResult) {
//        Result<Person> result = new Result();
        if (bindingResult.hasFieldErrors()) {
            // 优化返回方式
//            result.setCode(1);
//            result.setMessage(bindingResult.getFieldError().getDefaultMessage());
//            return result;
            return ResultUtil.returnFail(bindingResult.getFieldError().getDefaultMessage());
        }
        // 可抽象出产生结果的工具类
//        result.setCode(0);
//        result.setMessage("成功");
//        result.setData(person);

        return ResultUtil.returnSuccess(person);
    }

    @RequestMapping(value = {"getDemoSecond", "getDemo"}, method = RequestMethod.GET)
    public String getDemo() {
        JSONObject result = new JSONObject();
        result.put("result", demo);

        return result.toJSONString();
    }

    // 测试 GlobalDefaultExceptionHandler
    /*@RequestMapping(value = "/test/error", method = RequestMethod.GET)
    public Integer testError() {
        return 100 / 0;
    }*/
}
