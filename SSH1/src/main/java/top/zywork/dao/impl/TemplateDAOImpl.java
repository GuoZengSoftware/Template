package top.zywork.dao.impl;

import top.zywork.dao.AbstractBaseDAO;
import top.zywork.dao.TemplateDAO;
import top.zywork.dos.TemplateDO;
import top.zywork.query.PageQuery;
import top.zywork.query.StatusQuery;

import java.util.List;

/**
 * Created by Wang Genshen on 2017-08-24.
 */
public class TemplateDAOImpl extends AbstractBaseDAO implements TemplateDAO {
    @Override
    public void save(TemplateDO templateDO) {
        getSessionFactory().getCurrentSession().save(templateDO);
    }

    @Override
    public void remove(TemplateDO templateDO) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void update(TemplateDO templateDO) {

    }

    @Override
    public void updateStatus(StatusQuery statusQuery) {

    }

    @Override
    public TemplateDO getById(Long id) {
        return null;
    }

    @Override
    public List<TemplateDO> listAll() {
        return null;
    }

    @Override
    public List<TemplateDO> listPage(PageQuery pageQuery) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
