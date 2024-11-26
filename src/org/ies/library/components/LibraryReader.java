package org.ies.library.components;

import org.ies.library.model.Biblioteca;
import org.ies.library.model.Book;

import java.util.Scanner;

public class LibraryReader {

    private final Scanner scanner;
    private BookReader bookReader;

    public LibraryReader(Scanner scanner) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }

    public Biblioteca read() {
        System.out.println("Introduzca el nombre de la biblioteca: ");
        String nombre = scanner.nextLine();

        System.out.println("Ahora, introduzca la cantidad de libros que desea buscar: ");
        int size = scanner.nextInt();
        Book[] libro = new Book[size];

        for (int i = 0; i < libro.length; i++) {
            System.out.println("Introduzca el nombre del libro número" + i);
            String libros = scanner.nextLine();
            libro[i] = bookReader.read();
        }
        return new Biblioteca(nombre, libro);
    }
}
