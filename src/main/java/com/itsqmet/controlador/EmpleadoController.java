package com.itsqmet.controlador;

import com.itsqmet.modelo.Empleado;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
@GetMapping("/registro-empleado")
    public String mostrarFormulario(Model model){
    Empleado empleado=new Empleado();
    model.addAttribute("empleado",empleado);
    return "empleados/registerEmpleado";
    }
@PostMapping("/registrar-empleado")
    public String enviarEmpleado(@Valid @ModelAttribute Empleado empleado,
                                 BindingResult bindingResult,Model model){
    if (bindingResult.hasErrors()){
        model.addAttribute("errores",bindingResult.getAllErrors());
        return "empleados/registerEmpleado";//si hay error te devuelve o se queda en el mismo form
    }else{
        return "empleados/listaEmpleados"; //caso contrario te lleva a la lista
    }
}
}
/*
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
*/

