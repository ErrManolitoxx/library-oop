package org.ies.library.components;

import org.ies.library.model.Autor;

import java.util.Scanner;

public class AuthorReader {

    private final Scanner scanner;

    public AuthorReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Autor read() {
        System.out.println("Introduzca el NIF del autor: ");
        String nif = scanner.nextLine();

        System.out.println("Introduzca el nombre del autor: ");
        String nombre = scanner.nextLine();

        System.out.println("Introduzca los apellidos del autor: ");
        String apellidos = scanner.nextLine();

        return new Autor(nif, nombre, apellidos);
    }
}
