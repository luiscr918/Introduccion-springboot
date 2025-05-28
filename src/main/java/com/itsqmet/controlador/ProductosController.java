package com.itsqmet.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductosController {
    @GetMapping ("/productos")
    public String catalogoProductos(){
        return "productos/catalogo";
    }
    @GetMapping("/registro-productos")
    public String registroProductos(){
        return "productos/registro";
    }
}
