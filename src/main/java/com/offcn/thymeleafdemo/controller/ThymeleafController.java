package com.offcn.thymeleafdemo.controller;

import com.offcn.thymeleafdemo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Controller
@RequestMapping("thy")
public class ThymeleafController {

    @RequestMapping("test")
    public String test(Model model){
        model.addAttribute("name","zhangfei");

        //实体类类型数据的操作
        User user = new User(1001,"guanyu");
        model.addAttribute("user",user);

        //map类型数据的操作
        Map<String,String>map = new HashMap<>();
        map.put("key1","/1.jpg");
        model.addAttribute("imageMap",map);

        //集合的遍历操作
        User user1 = new User(1001,"guanyu1");
        User user2 = new User(1002,"guanyu2");
        User user3 = new User(1003,"guanyu3");
        List<User>list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("list",list);

        //字符串拼接的操作
        model.addAttribute("username","刘备");

        //选择操作
        model.addAttribute("flag","y");

        //测试内置对象
        model.addAttribute("date",new Date());

        model.addAttribute("num",14353030405.34534d);

        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("desc",str);

        return "test.html";
    }

    @RequestMapping("test2")
    public String test2(Model model){
        return "test2.html";
    }
}
