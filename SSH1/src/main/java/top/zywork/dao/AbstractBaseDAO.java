package top.zywork.dao;

import org.hibernate.SessionFactory;

/**
 * 抽象的BaseDAO类，主要用于SSH中注入sessionFactory<br />
 * 创建于2017-08-24
 *
 * @author 王振宇
 * @version 1.0
 */
public abstract class AbstractBaseDAO {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
