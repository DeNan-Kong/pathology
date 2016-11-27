package com.hinacom.pathology.web.controller;

import com.hinacom.pathology.web.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Created by fyu1 on 16/11/27.
 */
@Controller
@RequestMapping("rest")
public class RestController extends BaseController{
    @RequestMapping("")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("rest");
        return mv;
    }

    @RequestMapping("submit")
    @ResponseBody
    public ArrayList<User> submit(@RequestBody User id) {
        ArrayList<User> userList = new ArrayList<User>();
        User outUser = new User();
        outUser.setId(1);
        outUser.setName("CaiCai");
        userList.add(outUser);


        outUser = new User();
        outUser.setId(2);
        outUser.setName("MiaoMiao");
        userList.add(outUser);

        return userList;
    }
}
