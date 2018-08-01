package com.example.demo.controll;

import com.example.demo.pojo.User;
import com.example.demo.service.TestInterFace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
/*@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example.demo.service"})*/
@RequestMapping("/test")
public class TestBootController {

    @Autowired
    private TestInterFace testInterFace;

    //增加日志
    private final Logger log = LoggerFactory.getLogger(TestBootController.class);

    @RequestMapping("/num")
    @ResponseBody
    int home() {
        int i = testInterFace.testInterFace();
        return i;
    }
    @RequestMapping("/get")
    @ResponseBody
    User getUser() {
        //打印日志
        log.info("TestBootController getUser info");
        return testInterFace.testUser();
    }


    //增加新的对外访问接口
    @RequestMapping("/add")
    @ResponseBody String add() {
        testInterFace.insertUser("username","password朱");
        return "插入成功";
    }
    //新增的接口方法
    @RequestMapping("/getAll")
    @ResponseBody
    List<User> getAll() {
        return testInterFace.selectALL();
    }
}