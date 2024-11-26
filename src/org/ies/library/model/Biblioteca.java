package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {

    private String nombre;
    private Book[] libro;

    public Biblioteca(String nombre, Book[] libro) {
        this.nombre = nombre;
        this.libro = libro;
    }
    public Book hasBook(String isbn) {
        for(Book book: libro) {
            if(book.getTitulo().equals(libro)) {
                return book;
            }
        }return null;
    }

    public boolean hasAuthor(String nif) {
        for(Autor autor: libro) {
            if(autor.getNif().equals(nif)) {
                return true;
            }
        }return false;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Book[] getLibro() {
        return libro;
    }

    public void setLibro(Book[] libro) {
        this.libro = libro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre) && Objects.deepEquals(libro, that.libro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Arrays.hashCode(libro));
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libro=" + Arrays.toString(libro) +
                '}';
    }
}
