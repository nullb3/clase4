package com.clase4.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //convertirlo en un rest controller.
@RequestMapping("/info")
public class infoControlador {
    @GetMapping
    public String status(){
        return "Online";
    }
}
