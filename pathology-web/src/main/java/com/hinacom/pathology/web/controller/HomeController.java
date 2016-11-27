package com.hinacom.pathology.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 * Created by fyu1 on 16/11/20.
 */
@Controller
@RequestMapping("index")
public class HomeController extends BaseController {

    private static Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping("")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");

        return new ModelAndView("index");
    }
}
