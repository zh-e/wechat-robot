package com.zhe.robot.controller;

import com.zhe.robot.constant.RoborConstant;
import com.zhe.robot.utils.SecretUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/robot/sign")
@RestController
public class SignController {

    @GetMapping("/check")
    public String check(@RequestParam String signature, @RequestParam String timestamp,
                        @RequestParam String nonce, @RequestParam String echostr) {

        System.out.println(signature + " " + timestamp + " " + nonce + " " + echostr);

        //1）将token、timestamp、nonce三个参数进行字典序排序
        List<String> param = new ArrayList<>(3);
        param.add(RoborConstant.TOKEN);
        param.add(timestamp);
        param.add(nonce);
        param.sort(String::compareTo);

        //2）将三个参数字符串拼接成一个字符串进行sha1加密
        String text = param.stream().map(Object::toString).collect(Collectors.joining());
        String textShare1 = SecretUtil.sha1(text);

        //3）开发者获得加密后的字符串可与 signature 对比，标识该请求来源于微信
        if (textShare1.equals(signature)) {
            return echostr;
        }
        return "";
    }

}
