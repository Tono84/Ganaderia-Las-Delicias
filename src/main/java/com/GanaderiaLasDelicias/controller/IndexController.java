/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GanaderiaLasDelicias.controller;

import com.GanaderiaLasDelicias.domain.Cliente;
import com.GanaderiaLasDelicias.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author joses
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping("/")
    public String incio(Model model){
//       model.addAllAttributes("atribute","value");
       return "index";
    }
    
 @GetMapping("/cliente/listado")
    public String inicio(Model model) {
        var clientes=clienteService.getClientes();
        
        model.addAttribute("totalClientes",clientes.size());
        
        model.addAttribute("clientes",clientes);
        return "/cliente/listado";
    }

    @GetMapping("/cliente/nuevo")
    public String nuevoCliente(Cliente cliente) {
        return "/cliente/modificar";
    }

    @PostMapping("/cliente/guardar")
    public String guardarCliente(Cliente cliente) {
        clienteService.save(cliente);
        return "index";
    }

    @GetMapping("/cliente/modificar/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "/cliente/modificar";
    }

    @GetMapping("/cliente/eliminar/{idCliente}")
    public String eliminarCliente(Cliente cliente) {
        clienteService.delete(cliente);
        return "redirect:/cliente/listado";

    }

}
