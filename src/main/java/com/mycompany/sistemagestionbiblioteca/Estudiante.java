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
public class Estudiante extends Usuario {
    private String idBanner;
    private int nmatricula;
    private String semestre;
    private String paralelo;

    public String getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(String idBanner) {
        this.idBanner = idBanner;
    }

    public int getNmatricula() {
        return nmatricula;
    }

    public void setNmatricula(int nmatricula) {
        this.nmatricula = nmatricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public Estudiante() {
    }

    public Estudiante(String idBanner, int nmatricula, String semestre, String paralelo, int cedula, String nombres, int edad, String direccionDomicilio) {
        super(cedula, nombres, edad, direccionDomicilio);
        this.idBanner = idBanner;
        this.nmatricula = nmatricula;
        this.semestre = semestre;
        this.paralelo = paralelo;
    }
 
    @Override
    public void ingresarUsuario(){
        super.ingresarUsuario();
        System.out.print("Ingrese el ID Banner: ");
        idBanner = sc.nextLine();
        while (true) {
        try {
        System.out.print("Ingrese el numero de matricula (1-3): ");
        nmatricula = sc.nextInt();
        if (nmatricula <= 0) {
            System.out.println("El numero de matricula no puede ser negativo o cero");
            continue;
        }
        if (nmatricula < 1 || nmatricula > 3) {
            System.out.println("Debe ingresar un numero entre 1 y 3");
            continue;
        }
        sc.nextLine(); 
        break; 
    } catch (InputMismatchException e) {
        System.out.println("Error, debe ingresar solo numeros");
        sc.nextLine(); 
    }
    }
        System.out.print("Ingrese el semestre: ");
        semestre = sc.nextLine();
        System.out.print("Ingrese el paralelo: ");
        paralelo = sc.nextLine();
    }
    
    @Override
    public void mostrarUsuario() {
        super.mostrarUsuario();
        System.out.println("ID Banner: " + idBanner);
        System.out.println("Numero de Matricula: " + nmatricula);
        System.out.println("Semestre: " + semestre);
        System.out.println("Paralelo: " + paralelo);
    }
}
