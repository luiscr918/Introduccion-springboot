package com.itsqmet.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
@GetMapping("/registro-empleado")
    public String registroEmpleado(){
    return "empleados/registerEmpleado";
    }

}
