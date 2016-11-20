package com.hinacom.pathology.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by fyu1 on 16/11/20.
 */
@Controller
@RequestMapping("index")
public class HomeController extends BaseController {
    @RequestMapping("")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("index");
    }
}
