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
public class Usuario {
    private int cedula;
    private String nombres;
    private int edad;
    private String direccionDomicilio;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public Usuario() {
    }

    public Usuario(int cedula, String nombres, int edad, String direccionDomicilio) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.edad = edad;
        this.direccionDomicilio = direccionDomicilio;
    }
  
    Scanner sc = new Scanner (System.in);
    public void ingresarUsuario(){
        while (true) {
        try {
            System.out.print("Ingrese su cedula: ");
            cedula = sc.nextInt();
            if (cedula <= 0) {
                System.out.println("La cédula no puede ser negativa ni cero");
                continue; 
            }
            sc.nextLine(); 
            break; 
        } catch (InputMismatchException e) {
            System.out.println("Error, debe ingresar solo numeros");
            sc.nextLine(); 
        }
        }
        System.out.print("Ingrese sus nombres: ");
        nombres = sc.nextLine();
        while (true) {
        try {
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();
            if (edad <= 0) {
                System.out.println("La edad debe ser mayor que cero");
                continue;
            }
            sc.nextLine();
            break;
        } catch (InputMismatchException e) {
            System.out.println("Error, debe ingresar solo numeros");
            sc.nextLine();
        }
    } 
        System.out.print("Ingrese su direccion de domicilio: ");
        direccionDomicilio = sc.nextLine();
    }
    
    public void mostrarUsuario(){
        System.out.println("_______DATOS USUARIO______");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombres: " + nombres);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccionDomicilio);
    }
    
    public void ConsultarMateriales(Biblioteca sistema) {
       sistema.mostrarMateriales();
    }

    public void solicitarPrestamo(Biblioteca sistema) throws Excepciones.MaterialNoEncontradoException,Excepciones.MaterialNoPrestadoException {
        try {
            System.out.print("Ingrese el titulo del material a solicitar: ");
            String titulo = sc.nextLine();
            ArchivosBiblioteca material = sistema.buscarArchivo(titulo);
            sistema.crearPrestamo(this, material);

        } catch (Excepciones.MaterialNoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (Excepciones.MaterialNoPrestadoException e) {
            System.out.println(e.getMessage()); 
        }
    }
}
