package com.actividad5.actividad5.controller;

import com.actividad5.actividad5.Pedido;
import com.actividad5.actividad5.Producto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @PostMapping("/pedido")
    public String Pedido(@RequestBody Pedido pedido){
        Integer numProductos = 0;
        double precioProductos = 0.0;

        for(Producto p : pedido.getProductos()){
            numProductos += p.getCantidad();
            precioProductos += p.getCantidad() * p.getPrecio();
        }

        return "{\n" +
                "\"cliente\": " + "\"" + pedido.getCliente().getNombre() + "\"" +
                "\n\"totalProductos\": " + numProductos + ",\n\"precioTotal\": " + precioProductos + ",\n\"mensaje\": \"Pedido recibido correctamente\"" + "\n}";


        /* Se supone que así se haría correctamente (cortesía de la IA):

        Map<String, Object> respuesta = new LinkedHashMap<>();

        respuesta.put("cliente", pedido.getCliente().getNombre());
        respuesta.put("totalProductos", numProductos);
        respuesta.put("precioTotal", precioProductos);
        respuesta.put("mensaje", "Pedido recibido correctamente");

        return respuesta; */

    }
}