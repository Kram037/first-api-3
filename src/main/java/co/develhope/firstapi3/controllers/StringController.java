package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class StringController{

    @GetMapping("/{str}")
    public String getString(@PathVariable String str, @RequestParam(required = false) String str1){

        if(str1 == null){
            return str;
        } else{
            return str + " " + str1;
        }
    }
}