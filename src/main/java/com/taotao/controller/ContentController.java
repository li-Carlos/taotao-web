package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentService;
import com.taotao.pojo.TbContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/content/query/list")
    @ResponseBody
    public EasyUIDataGridResult getContentList(Long categoryId, Integer page, Integer rows) {
        EasyUIDataGridResult result = contentService.getContentList(categoryId,page,rows);
        return result;
    }
    @RequestMapping("/content/save")
    @ResponseBody
    public TaotaoResult ContentSave(TbContent tbContent) {
        TaotaoResult result = contentService.addContent(tbContent);
        return result;
    }

    @RequestMapping("/content/delete")
    @ResponseBody
    public TaotaoResult ContentDelete(String[] ids) {
        TaotaoResult result = contentService.contentDelete(ids);
        return result;
    }
    @RequestMapping("/rest/content/edit")
    @ResponseBody
    public TaotaoResult restContentEdit(TbContent tbContent) {
        TaotaoResult result = contentService.restContentEdit(tbContent);
        return result;
    }
}
