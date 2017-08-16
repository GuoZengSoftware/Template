package top.zywork.vo;

import top.zywork.enums.ControllerResultEnum;

/**
 * 控制器结果，通常都是在页面上执行添加，删除，状态改变等操作时，由控制器返回执行结果的JSON格式数据到前端页面
 * 创建于2017-08-16
 *
 * @author Wang Zhenyu
 * @version 1.0
 * @see top.zywork.enums.ControllerResultEnum
 */
public class ControllerResultVO {

    private String result;
    private String message;

    public ControllerResultVO() {

    }

    public ControllerResultVO(String result, String message) {
        this.result = result;
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取表示执行成功的结果
     *
     * @param message 需要返回到前端页面的提示信息
     * @return 表示执行成功的结果
     */
    public static ControllerResultVO successResult(String message) {
        return new ControllerResultVO(ControllerResultEnum.SUCCESS.getValue(), message);
    }

    /**
     * 获取表示执行失败的结果
     *
     * @param message 需要返回到前端页面的提示信息
     * @return 表示执行失败的结果
     */
    public static ControllerResultVO failResult(String message) {
        return new ControllerResultVO(ControllerResultEnum.FAIL.getValue(), message);
    }

    @Override
    public String toString() {
        return "ControllerResultVO{" +
                "result='" + result + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
