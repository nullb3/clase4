package com.clase4.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PracticaControlador{
    @GetMapping
    public String Saludar(){
        return "Hola!";
    }
    @GetMapping
    public String Greet(){
        return "Hello!";
    }
    @PostMapping("/administrar")
    public String PostName(String name){
        System.out.println(name);
        return "La persona dice que su nombre es "+name;
    }
}