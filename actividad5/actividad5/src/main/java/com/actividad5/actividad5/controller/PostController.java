package com.actividad5.actividad5.controller;

import com.actividad5.actividad5.Cliente;
import com.actividad5.actividad5.Pedido;
import com.actividad5.actividad5.Producto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @PostMapping("/pedido")
    public String Pedido(@RequestBody Pedido pedido){

    }
}

/*
* {
  "cliente": {
    "nombre": "María Pérez",
    "correo": "maria.perez@email.com",
    "telefono": "123456789"
  },
  "productos": [
    {
      "nombre": "Teclado",
      "cantidad": 2,
      "precioUnitario": 25.50
    },
    {
      "nombre": "Mouse",
      "cantidad": 1,
      "precioUnitario": 15.00
    },
    {
      "nombre": "Monitor",
      "cantidad": 1,
      "precioUnitario": 150.00
    }
  ]
}
*
*
* {
  "cliente": "María Pérez",
  "totalProductos": 4,
  "precioTotal": 216.00,
  "mensaje": "Pedido recibido correctamente"
}*/