package top.zywork.enums;

/**
 * 常用进制枚举
 * 创建于2017-08-15
 *
 * @author Wang Zhenyu
 * @version 1.0
 */
public enum RadixEnum {
    BINARY(2),
    OCTAL(8),
    DECIMAL(10),
    HEX(16);

    private int value;

    RadixEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
