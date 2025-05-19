package com.distribuida.test;

import com.distribuida.entities.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setup(){

        cliente = new Cliente(1,"1765340978","Luis","Suarez","Uruguay","0978866524","luissuarez@gmail.com");

    }

    @Test
    public void testClienteConstructorAndGetters() {

        assertAll("Validar datos Cliente , Constructor y Getters",

                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("1765340978", cliente.getCedula()),
                () -> assertEquals("Luis", cliente.getNombre()),
                () -> assertEquals("Suarez", cliente.getApellido()),
                () -> assertEquals("Uruguay", cliente.getDireccion()),
                () -> assertEquals("0978866524", cliente.getTelefono()),
                () -> assertEquals("luissuarez@gmail.com", cliente.getCorreo())
                );

    }

    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1567864532");
        cliente.setNombre("Neymar");
        cliente.setApellido("Santos");
        cliente.setDireccion("Brazil");
        cliente.setTelefono("0976677542");
        cliente.setCorreo("neymar@gmail.com");

        assertAll("Validar Datos Clientes - Setters",

                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("1567864532", cliente.getCedula()),
                () -> assertEquals("Neymar", cliente.getNombre()),
                () -> assertEquals("Santos", cliente.getApellido()),
                () -> assertEquals("Brazil", cliente.getDireccion()),
                () -> assertEquals("0976677542", cliente.getTelefono()),
                () -> assertEquals("neymar@gmail.com", cliente.getCorreo())

        );


    }

}


