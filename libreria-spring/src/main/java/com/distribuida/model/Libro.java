package com.distribuida.model;

import java.util.Date;

public class Libro {
    private int idLibro;
    private String titulo;
    private String editorial;
    private int numpaginas;
    private String edicion;
    private String idioma;
    private Date fechaPublicacion;
    private String descripcion;
    private String tipopasta;
    private String ISBN;
    private int numejemplares;
    private String portada;
    private String presentacion;
    private double precio;
    private Categoria categoria;
    private Autor autor;

    public Libro(){

    }

    public Libro(int idLibro, String titulo, String editorial, int numpaginas, String edicion, String idioma, String descripcion, Date fechaPublicacion, String tipopasta, String ISBN, int numejemplares, String portada, String presentacion, double precio, Categoria categoria, Autor autor) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.numpaginas = numpaginas;
        this.edicion = edicion;
        this.idioma = idioma;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
        this.tipopasta = tipopasta;
        this.ISBN = ISBN;
        this.numejemplares = numejemplares;
        this.portada = portada;
        this.presentacion = presentacion;
        this.precio = precio;
        this.categoria = categoria;
        this.autor = autor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(double numpaginas) {
        this.numpaginas = (int) numpaginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipopasta() {
        return tipopasta;
    }

    public void setTipopasta(String tipopasta) {
        this.tipopasta = tipopasta;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getNumejemplares() {
        return numejemplares;
    }

    public void setNumejemplares(double numejemplares) {
        this.numejemplares = (int) numejemplares;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public float getPrecio() {
        return (float) precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numpaginas=" + numpaginas +
                ", edicion='" + edicion + '\'' +
                ", idioma='" + idioma + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", descripcion='" + descripcion + '\'' +
                ", tipopasta='" + tipopasta + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numejemplares=" + numejemplares +
                ", portada='" + portada + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", autor=" + autor +
                '}';
    }
}
