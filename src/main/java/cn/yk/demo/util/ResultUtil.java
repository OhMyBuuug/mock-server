package cn.yk.demo.util;

import cn.yk.demo.bo.Result;

/**
 * <br> Project: mock-server
 * <br> Package: cn.yk.demo.util
 * <br> Description:
 * <br> Date: Created in 10:41 2017/3/30.
 * <br> Modified By
 *
 * @author SiGen
 */
public class ResultUtil {
    public static Result returnSuccess(Object object) {
        Result result = new Result();

        result.setCode(0);
        result.setMessage("成功");
        result.setData(object);

        return result;
    }

    // 只返回成功状态值时调用
    public static Result returnSuccess() {
        return returnSuccess(null);
    }

    public static Result returnFail(Object object) {
        Result result = new Result();

        result.setCode(1);
        result.setMessage("失败");

        return result;
    }
}
