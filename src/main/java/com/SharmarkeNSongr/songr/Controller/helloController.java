package com.SharmarkeNSongr.songr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class helloController {

    @GetMapping("/")
    public String getHome(){
        return "hello.html";
    }

    @ResponseBody
    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word) {
        return word.toUpperCase();
    }


}
