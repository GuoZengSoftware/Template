package top.zywork.enums;

/**
 * 控制器执行结果枚举
 * 创建于2017-08-16
 *
 * @author Wang Zhenyu
 * @version 1.0
 */
public enum ControllerResultEnum {

    SUCCESS("success"),
    FAIL("fail");


    private String value;

    ControllerResultEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
