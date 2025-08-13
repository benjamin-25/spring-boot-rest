package com.servicioWeb.servicioWeb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//con esto definimos que nuestra clase es un controlador, para poder manejar Url en nuestro servicio o app web
@RestController
public class usuarioController {

    @RequestMapping(value = "prueba")
    public List<String> saludo(){
        return List.of("Benjamin", " Ana", "Angie", "Tatiana");
    }

    @GetMapping(value = "/usuario")
    public String usuarios(){
        return "hola";
    }
}