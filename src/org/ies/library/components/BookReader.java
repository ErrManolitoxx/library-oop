package org.ies.library.components;

import org.ies.library.model.Autor;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {

    private final Scanner scanner;
    private AuthorReader authorReader;

    public BookReader(Scanner scanner) {
        this.scanner = scanner;
        this.authorReader = authorReader;
    }

    public Book read () {
        System.out.println("Introduce los datos del libro:");
        System.out.println("Introduzca el ISBN del libro: ");
        String isbn = scanner.nextLine();

        System.out.println("Introduzca el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.println("Introduzca el año de publicación del libro: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca el número de autores que tiene el libro: ");
        int size = scanner.nextInt();
        Autor[] autores = new Autor[size];

        for (int i = 0; i < autores.length; i++) {
            autores[i] = authorReader.read();
        }

        return new Book(isbn, titulo, year, autores);
    }
}
