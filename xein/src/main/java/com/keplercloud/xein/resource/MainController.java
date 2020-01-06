package com.keplercloud.xein.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MHS DILSHAN
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "hrms/index";
    }
}
