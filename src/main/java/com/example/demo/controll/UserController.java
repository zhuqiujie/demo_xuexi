package com.example.demo.controll;

import com.example.demo.pojo.User;
import com.example.demo.service.TestInterFace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private TestInterFace testInterFace;
    //增加日志
    private final Logger log = LoggerFactory.getLogger(TestBootController.class);
    @RequestMapping("/get")
    @ResponseBody
    User getUser() {
        //打印日志
        log.info("TestBootController getUser info");
        return testInterFace.testUser();
    }
}
