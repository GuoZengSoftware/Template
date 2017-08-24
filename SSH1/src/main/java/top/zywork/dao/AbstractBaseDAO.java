package top.zywork.dao;

import org.hibernate.SessionFactory;

/**
 * Created by Wang Genshen on 2017-08-24.
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
