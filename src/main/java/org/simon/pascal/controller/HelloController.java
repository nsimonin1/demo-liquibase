/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.simon.pascal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author simon.pascal.ngos
 */
@Controller
public class HelloController {
    @Value("${project.version}") 
    private  String projectVersion;
    
    @RequestMapping("/")
    public String defaultPath(){
        return "redirect:/index.htm";
    }
    
    @RequestMapping("/index.htm")
    public ModelAndView index(){
        ModelAndView mav=new ModelAndView("index");
        mav.addObject("projectVersion", projectVersion);
        return mav;
    }
    
}
