package com.jb4dc.site.tl.webserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: zhuangrb
 * Date: 2020/6/4
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("Templates/BuildSite/{templateId}")
public class HomeController {

    @GetMapping
    public ModelAndView index(HttpServletRequest request, @PathVariable String templateId) {
        //FeignRequestInterceptor.SessionToken="hellow 123";
        //request.getSession().getId();
        //JBuild4DCResponseVo zhuibobo = sessionRemote.loginForRest("xxxxxxxx","zhuibobo", "1");
        //return JsonUtility.toObjectString(zhuibobo);
        String TemplateName = "";
        if(templateId.equals("1")) {
            TemplateName = "Templates/Home";
        }
        else
        {
            TemplateName = "Templates/Home2";
        }
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName(TemplateName);
        return modelAndView;
    }

}
