package com.molo.springbootprj;

import com.molo.springbootprj.dbsample.SampleMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    
    @Autowired SampleMapper sampleMapper;
    
    @RequestMapping("/")
    public String index(@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("dbdata", sampleMapper.selectSampleData());
        return "index";
    }
}
