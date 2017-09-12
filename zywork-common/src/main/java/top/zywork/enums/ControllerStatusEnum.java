package top.zywork.enums;

/**
 * 控制器执行结果枚举
 * 创建于2017-08-16
 *
 * @author 王振宇
 * @version 1.0
 */
public enum ControllerStatusEnum {

    OK("ok"),
    ERROR("error");


    private String value;

    ControllerStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
