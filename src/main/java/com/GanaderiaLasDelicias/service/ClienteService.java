/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.GanaderiaLasDelicias.service;

import com.GanaderiaLasDelicias.domain.Cliente;
import java.util.List;

/**
 *
 * @author joses
 */
public interface ClienteService {

    public List<Cliente> getClientes();

    public Cliente getCliente(Cliente cliente);

    public void save(Cliente cliente);

    public void delete(Cliente cliente);
}
