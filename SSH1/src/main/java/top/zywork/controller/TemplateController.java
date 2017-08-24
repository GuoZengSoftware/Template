package top.zywork.controller;

import com.opensymphony.xwork2.ActionSupport;
import top.zywork.common.EncryptUtils;
import top.zywork.dto.TemplateDTO;
import top.zywork.service.TemplateService;

/**
 * Created by Wang Genshen on 2017-08-24.
 */
public class TemplateController extends ActionSupport {
    private static final long serialVersionUID = 1647679288455528889L;

    private TemplateService templateService;

    public void setTemplateService(TemplateService templateService) {
        this.templateService = templateService;
    }

    public String execute() {
        TemplateDTO templateDTO = new TemplateDTO();
        templateDTO.setName("test");
        templateDTO.setPassword(EncryptUtils.md5("123456"));
        templateService.save(templateDTO);
        return SUCCESS;
    }
}
