package com.distribuida.principal;

import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

import java.util.Date;

public class FacturaDetallePrincipal {

    public static void main(String[] args){

        FacturaDetalle facturaDetalle = new FacturaDetalle();

        Libro libro = new Libro();
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


        facturaDetalle.setIdFacturaDetalle(2);
        facturaDetalle.setCantidad(2);
        facturaDetalle.setSubtotal(23.23);
        facturaDetalle.setLibro(libro);

        System.out.println(facturaDetalle.toString());


    }

}
