package com.servicioWeb.servicioWeb.controllers;

import com.servicioWeb.servicioWeb.models.UsuarioModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//con esto definimos que nuestra clase es un controlador, para poder manejar Url en nuestro servicio o app web
@RestController
public class usuarioController {

    @RequestMapping(value = "getUser")
    public UsuarioModel getUsuario(){
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNombre("Benjamin");
        usuario.setApellido("Prueba");
        usuario.setCorreo("benja@gmail.com");
        usuario.setPassword("Bapg123456789*");
        return usuario;
    }

    @RequestMapping(value = "prueba")
    public List<String> saludo(){
        return List.of("Benjamin", " Ana", "Angie", "Tatiana");
    }

    @GetMapping(value = "/usuario")
    public String usuarios(){
        return "hola";
    }
}