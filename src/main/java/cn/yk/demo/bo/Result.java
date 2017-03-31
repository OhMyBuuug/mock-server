package cn.yk.demo.bo;

/**
 * <br> Project: mock-server
 * <br> Package: cn.yk.demo.bo
 * <br> Description: Http请求的嘴歪城对象
 * <br> Date: Created in 19:33 2017/3/29.
 * <br> Modified By
 *
 * @author SiGen
 */
public class Result<T> {
    // 错误码
    private Integer code;

    // 提示信息
    private String message;

    // 具体内容
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
