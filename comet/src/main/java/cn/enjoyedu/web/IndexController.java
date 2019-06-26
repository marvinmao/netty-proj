package cn.enjoyedu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author marvinmao
 *
 * 类说明：
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }

}
