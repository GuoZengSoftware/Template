package top.zywork.dos;

import java.io.Serializable;

/**
 * 所有DO的父类，具有所有DO的统一标识符id属性，id属性为Integer类型
 * 创建于2017-08-15
 *
 * @author Wang Zhenyu
 * @version 1.0
 */
public class BaseDO implements Serializable {

    private static final long serialVersionUID = -1990701184136933177L;

    private Integer id;

    public BaseDO() {}

    public BaseDO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseDO baseDO = (BaseDO) o;

        return id != null ? id.equals(baseDO.id) : baseDO.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
