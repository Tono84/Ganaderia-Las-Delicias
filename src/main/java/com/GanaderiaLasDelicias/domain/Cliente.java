package com.GanaderiaLasDelicias.domain;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author joses
 */
@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;//hibernate lo convierte en id_cliente
    String nombre;
    String apellidos;
    String correo;
    String telefono;
    String usuario;
    String password;
    int tarjeta_numero;
    String tarjeta_nombre ;
    String rol;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono, String usuario, String password, int tarjeta_numero , String tarjeta_nombre ) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
        this.tarjeta_numero = tarjeta_numero ;
        this.tarjeta_nombre  = tarjeta_nombre ;
    }

    public Cliente(long idCliente, String nombre, String apellidos, String correo, String telefono, String usuario, String password, int tarjeta_numero , String tarjeta_nombre , String rol) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
        this.tarjeta_numero = tarjeta_numero ;
        this.tarjeta_nombre  = tarjeta_nombre ;
        this.rol = rol;
    }

}
