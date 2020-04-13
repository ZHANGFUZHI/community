package life.builder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther:zhangfz
 * @Date:2020/4/13
 * @Description:life.builder.community.controller
 * @version:1.0
 */
@Controller //Controller的意思就是说我允许这个类去接收前端的一个请求
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name,Model model){
        model.addAttribute("name", name);
        return "hello";
    }
}
