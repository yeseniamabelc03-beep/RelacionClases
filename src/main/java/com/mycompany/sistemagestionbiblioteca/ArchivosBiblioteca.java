/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestionbiblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public abstract class ArchivosBiblioteca {
    protected  String titulo;
    protected  String autor;
    protected  int anioPublicacion;
    protected int multa;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public ArchivosBiblioteca() {
    }

    public ArchivosBiblioteca(String titulo, String autor, int anioPublicacion, int multa) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.multa = multa;
    }

    //metodos
    Scanner sc = new Scanner (System.in); 
    public void ingresarArchivo() {
        System.out.print("Ingrese el titulo: ");
        titulo = sc.nextLine();
        System.out.print("Ingrese el autor: ");
        autor = sc.nextLine();
        while (true) {
        try {
        System.out.print("Ingrese el anio de publicacion: ");
        anioPublicacion = sc.nextInt();
        if (anioPublicacion <= 0) {
            System.out.println("El anio debe ser positivo");
            continue;
        }
        if (anioPublicacion > 2025) {
            System.out.println("El anio no puede ser mayor al actual");
            continue;
        }
        sc.nextLine(); 
        break; 
        }catch (InputMismatchException e) {
        System.out.println("Error, debe ingresar solo numeros");
        sc.nextLine(); 
        }
       }
    }
    
    public void mostrarArchivo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio de publicacion: " + anioPublicacion);
    }

    public abstract void CalcularMulta(int diasRetraso);
    
    public abstract void MostrarInfo();
    
    public abstract boolean PrestamoPermitir();
        
}
