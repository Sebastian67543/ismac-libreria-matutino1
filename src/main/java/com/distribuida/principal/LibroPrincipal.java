package com.distribuida.principal;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

import java.util.Date;

public class LibroPrincipal {

    public static void main(String[] args){

        Libro libro = new Libro();

        Categoria categoria = new Categoria(1,"Romance","Amores Prohibidos");
        Autor autor = new Autor(1,"Luis","Diaz","Ecuador","Tababela","911","pepe@chupin");

        libro.setIdLibro(1);
        libro.setTitulo("Amores");
        libro.setEditorial("Castellana");
        libro.setNumpaginas(12);
        libro.setEdicion("Edicion");
        libro.setIdioma("Ingles");
        libro.setFechaPublicacion(new Date(12));
        libro.setDescripcion("Mano");
        libro.setTipopasta("Amarilla");
        libro.setISBN("ISBN");
        libro.setNumejemplares(25);
        libro.setPortada("Roja");
        libro.setPresentacion("Mala");
        libro.setPrecio(10);
        libro.setCategoria(categoria);
        libro.setAutor(autor);


        System.out.println(libro.toString());



    }

}
