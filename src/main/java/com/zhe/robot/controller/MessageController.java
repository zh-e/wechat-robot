package com.zhe.robot.controller;

import com.zhe.robot.bean.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/robot/wechat")
@RestController
public class MessageController {

    @PostMapping(value = "/message", consumes = MediaType.TEXT_XML_VALUE)
    public String msg(@RequestBody Message m) {
        System.out.println("收到消息 + " + m.getFromUserName() + " : " + m.getContent());
        return "";
    }

}
