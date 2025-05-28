package com.itsqmet.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/productos")
public class ProductosController {
    //llamar a las paginas
    @GetMapping ("/productos")
    public String catalogoProductos(){
        return "productos/catalogo";
    }
    @GetMapping("/registro-productos")
    public String registroProductos(){
        return "productos/registro";
    }
    @GetMapping("/saludo")
    //enviar saludo personalizado a la pagina de catalogo
    public String saludoPersonalizado(@RequestParam String nombre, Model model){
        model.addAttribute("nombre",nombre);
        return "productos/catalogo";
    }
    //Enviar Datos
    @PostMapping("/enviar-producto")
    public String guardarProductos(@RequestParam String id,
                                   @RequestParam String nombre,
                                   @RequestParam String precio,
                                   @RequestParam String cantidad,Model model){
        model.addAttribute("codigo",id);
        model.addAttribute("nombre",nombre);
        model.addAttribute("precio",precio);
        model.addAttribute("cantidad",cantidad);
        return "productos/catalogo";
    }
}
