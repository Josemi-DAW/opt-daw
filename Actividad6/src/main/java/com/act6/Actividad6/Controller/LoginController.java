package com.act6.Actividad6.Controller;

import com.act6.Actividad6.Model.BaseDeUsuarios;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login.html";
    }

    @PostMapping("/login")
    @ResponseBody
    public String procesarLogin(@RequestParam String email,
                                @RequestParam String password) {

        if (!BaseDeUsuarios.usuarios.containsKey(email)) {
            return "Usuario inexistente.";
        }

        if (!BaseDeUsuarios.usuarios.get(email).equals(password)) {
            return "Contraseña incorrecta.";
        }

        return "Inicio de sesión correcto.";
    }
}
