/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.GanaderiaLasDelicias.dao;

import com.GanaderiaLasDelicias.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author joses
 */
public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
