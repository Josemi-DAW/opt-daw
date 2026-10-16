package com.act6.Actividad6.Model;

import java.util.HashMap;
import java.util.Map;

public class BaseDeUsuarios {

    public static Map<String, String> usuarios = new HashMap<>();

    static {
        usuarios.put("ana@example.com", "246810");
        usuarios.put("luis@example.com", "clave123");
    }
}
