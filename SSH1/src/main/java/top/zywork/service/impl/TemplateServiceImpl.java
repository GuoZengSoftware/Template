package top.zywork.service.impl;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import top.zywork.dao.TemplateDAO;
import top.zywork.dos.TemplateDO;
import top.zywork.dto.PagerDTO;
import top.zywork.dto.TemplateDTO;
import top.zywork.query.PageQuery;
import top.zywork.query.StatusQuery;
import top.zywork.service.TemplateService;

import java.util.List;

/**
 * Created by Wang Genshen on 2017-08-24.
 */
public class TemplateServiceImpl implements TemplateService {

    private TemplateDAO templateDAO;

    public void setTemplateDAO(TemplateDAO templateDAO) {
        this.templateDAO = templateDAO;
    }

    @Override
    public void save(TemplateDTO templateDTO) {
        Mapper mapper = new DozerBeanMapper();
        templateDAO.save(mapper.map(templateDTO, TemplateDO.class));
    }

    @Override
    public void remove(TemplateDTO templateDTO) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void update(TemplateDTO templateDTO) {

    }

    @Override
    public void updateStatus(StatusQuery statusQuery) {

    }

    @Override
    public TemplateDTO getById(Long id) {
        return null;
    }

    @Override
    public List<TemplateDTO> listAll() {
        return null;
    }

    @Override
    public PagerDTO listPage(PageQuery pageQuery) {
        return null;
    }
}
