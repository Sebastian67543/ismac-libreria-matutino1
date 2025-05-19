package com.distribuida.principal;

import com.distribuida.entities.Categoria;

public class CategoriaPrincipal {
    public static void main(String[] args){

        Categoria categoria = new Categoria(1,"Drama","Amor");
        System.out.println(categoria.toString());
    }
}
