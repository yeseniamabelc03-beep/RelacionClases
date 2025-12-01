/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestionbiblioteca;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Prestamo {
    private Usuario usuario;
    private ArchivosBiblioteca archivo;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private int multa;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArchivosBiblioteca getArchivo() {
        return archivo;
    }

    public void setArchivo(ArchivosBiblioteca archivo) {
        this.archivo = archivo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public Prestamo() {
    }

    public Prestamo(Usuario usuario, ArchivosBiblioteca archivo, String fechaPrestamo, String fechaDevolucion, int multa) {
        this.usuario = usuario;
        this.archivo = archivo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.multa = multa;
    }

        Scanner sc = new Scanner (System.in);
        public void ingresarPrestamo() {
        System.out.print("Ingrese la fecha de prestamo: ");
        fechaPrestamo = sc.nextLine();
        System.out.print("Ingrese la fecha de devolucion: ");
        fechaDevolucion = sc.nextLine();
        }
        
     public void mostrarPrestamo() {
        System.out.println("____Informacion Prestamo ____");
        System.out.println("Usuario: " + usuario.getNombres());
        System.out.println("Material: " + archivo.getTitulo());
        System.out.println("Fecha de prestamo: " + fechaPrestamo);
        System.out.println("Fecha de devolucion: " + fechaDevolucion);
        System.out.println("Multas anteriores a pagar: $"+ archivo.getMulta());
    }
     
}
