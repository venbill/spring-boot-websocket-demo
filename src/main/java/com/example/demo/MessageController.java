package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午3:53 2018/8/10.
 */
@RestController
public class MessageController {
    @Autowired
    private MyWebSocket myWebSocket;

    /**
     * 向客户端推送消息
     * @param user
     * @param msg
     * @throws IOException
     */
    @GetMapping("/push")
    public void push(@RequestParam String user, @RequestParam String msg) throws IOException{
        myWebSocket.sendUserMessage(user,msg);
    }
}
