package com.itsqmet.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroController {
    @GetMapping("/registro")
    public String registroProductos(){
        return "productos/catalo";
    }
}
