package com.distribuida.principal;
import com.distribuida.entities.Cliente;
public class ClientePrincipal {

    public static void main(String[] args){
        Cliente cliente = new Cliente(1,"1758634895","Pepe","Taipe","Av.Los Olivos","0953657842","pepetaipe@gmail.com");

        System.out.println(cliente.toString());
    }
}
