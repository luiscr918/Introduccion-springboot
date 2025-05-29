package com.itsqmet.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
@GetMapping("/registro-empleado")
    public String registroEmpleado(){
    return "empleados/registerEmpleado";
    }
@PostMapping("/registrar-empleado")
    public String guardarEmpleado(@RequestParam String nombre,
                                  @RequestParam String apellido,
                                  @RequestParam String direccion,
                                  @RequestParam String fechaNac,
                                  @RequestParam String intereses,
                                  Model model
                                  ){
    model.addAttribute("nombre",nombre);
    model.addAttribute("apellido",apellido);
    model.addAttribute("direccion",direccion);
    model.addAttribute("fechaNac",fechaNac);
    model.addAttribute("intereses",intereses);
    return "index";
}
}
