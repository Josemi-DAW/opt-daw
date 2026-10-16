package com.act6.Actividad6.Controller;

import com.act6.Actividad6.Model.BaseDeUsuarios;
import com.act6.Actividad6.Model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class RegistroController {

    @GetMapping("/registro")
    public String mostrarFormUsuarioRegistro() {
        return "registro.html";
    }

    @PostMapping("/registro")
    @ResponseBody
    public String procesarRegistro(@ModelAttribute Usuario usuario) {

        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()
                || usuario.getEmail() == null || usuario.getEmail().isEmpty()) {
            return "Error: nombre y correo son obligatorios.";
        }

        String password = usuario.getPassword();
        boolean generada = false;

        if (password == null || password.isEmpty()) {
            int num = new Random().nextInt(1_000_000);
            password = String.format("%06d", num);
            generada = true;
        }

        BaseDeUsuarios.usuarios.put(usuario.getEmail(), password);

        String respuesta = "Usuario registrado: " + usuario.getNombre() + " " + usuario.getApellidos()
                + "<br>Correo: " + usuario.getEmail();

        if (generada) {
            respuesta += "<br>Contraseña generada: " + password;
        }

        return respuesta;
    }
}
