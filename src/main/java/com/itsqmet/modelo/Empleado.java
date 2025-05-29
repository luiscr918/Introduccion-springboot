package com.itsqmet.modelo;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
//crea un contructor vacio:
@NoArgsConstructor
@Getter
@Setter
public class Empleado {
    @Size(min = 3, max = 10)
    private String nombre;
    @NotBlank
    @Email(message = "Ingrese Correo Válido")
    private String email;

    @NotNull
    @Size(min = 8, max = 15)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,15}",
    message = "La contraseña debe tener una mayúscula,minúscula, un digito, un caracter especial")
    private String password;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
private Date fechaNacimiento;

    @NotBlank
    private String genero;

    @Size(min = 20,max = 250)
    private String direccion;

    @AssertTrue
    private Boolean estudios;
//OJO el size solo es para strings
    //min y max solo para numeros
    @Min(value = 400)
    @Max(value = 2000)
    private long sueldo;
    //get-setter
}
