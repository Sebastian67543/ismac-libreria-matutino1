package com.distribuida.dao;

import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)

public class ClienteRepositorioTestIntegracion {

    @Autowired //anotacion para inyectar dependencias
    private ClienteRepository clienteRepository;

    @Test
    public void findAll(){

        List<Cliente> clientes = clienteRepository.findAll();

        for (Cliente item: clientes){
            System.out.println(item.toString());
        }

    }

    @Test
    public void findOne(){
        Optional<Cliente> cliente = clienteRepository.findById(1);
        System.out.println(cliente.toString());

    }


    @Test
    public void save(){
        Cliente cliente = new Cliente(0,"1745897626","Piero","Hincapie","Esmeraldas","0953786523","phincapie@gmail.com");
        clienteRepository.save(cliente);

    }

    @Test
    public void update(){
        Optional<Cliente> cliente = clienteRepository.findById(39);

        cliente.orElse(null).setCedula("1734834976");
        cliente.orElse(null).setNombre("Jorguito");
        cliente.orElse(null).setApellido("Hincapie");
        cliente.orElse(null).setDireccion("Guayaquil");
        cliente.orElse(null).setTelefono("0974236791");
        cliente.orElse(null).setCorreo("jhincapie@gmail.com");

        clienteRepository.save(cliente.orElse(null));
    }

}
