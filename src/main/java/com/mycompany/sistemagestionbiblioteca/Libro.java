/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestionbiblioteca;

import java.util.InputMismatchException;



/**
 *
 * @author USER
 */
public class Libro extends ArchivosBiblioteca implements IPrestamo {
    private String ISBN;
    private String editorial;
    private String genero;
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Libro() {
    }

    public Libro(String ISBN, String editorial, String genero, String titulo, String autor, int anioPublicacion, int multa) {
        super(titulo, autor, anioPublicacion, multa);
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.genero = genero;
    }

    @Override
    public void ingresarArchivo(){
        super.ingresarArchivo();
        System.out.print("Ingrese el ISBN: ");
        ISBN = sc.nextLine();
        System.out.print("Ingrese la editorial: ");
        editorial = sc.nextLine();
        System.out.print("Ingrese el genero: ");
        genero = sc.nextLine();
    }
    @Override
    public void CalcularMulta(int diasRetraso) { 
        if (diasRetraso <= 0) {
        throw new IllegalArgumentException("Los dias de retraso deben ser mayores a 0");
    }
        multa += diasRetraso * 5; 
    }

    @Override
    public void MostrarInfo() {
       super.mostrarArchivo();
       System.out.println("ISBN: " + ISBN);
       System.out.println("Editorial: " + editorial);
       System.out.println("Genero: " + genero);
       System.out.println("Multa: " + multa);
    }

    @Override
    public void prestar() {
        System.out.println("El libro ha sido prestado");
    }

    @Override
    public void devolver() {
        System.out.println("El libro ha sido devuelto");
    }
    
    @Override
    public boolean PrestamoPermitir() {
        return true;
    }
}
