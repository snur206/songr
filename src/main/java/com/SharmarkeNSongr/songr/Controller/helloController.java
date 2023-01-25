package com.SharmarkeNSongr.songr.Controller;

import com.SharmarkeNSongr.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class helloController {
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome(){
        return "hello world";
    }
    @ResponseBody
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
    @GetMapping("/helloWorld")
    public String getHelloWorld(){
        return "hello";
    }
    @ResponseBody
    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word) {
        return word.toUpperCase();
    }


}
