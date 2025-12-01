/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestionbiblioteca;

/**
 *
 * @author USER
 */
public class Docente extends Usuario{
    private String idBanner;
    private String departamento;
    private String dedicacion;

    public String getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(String idBanner) {
        this.idBanner = idBanner;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public Docente() {
    }

    public Docente(String idBanner, String departamento, String dedicacion, int cedula, String nombres, int edad, String direccionDomicilio) {
        super(cedula, nombres, edad, direccionDomicilio);
        this.idBanner = idBanner;
        this.departamento = departamento;
        this.dedicacion = dedicacion;
    }

    @Override
    public void ingresarUsuario(){
        super.ingresarUsuario();
        System.out.print("Ingrese el ID Banner: ");
        idBanner = sc.nextLine();
        System.out.print("Ingrese el departamento: ");
        departamento = sc.nextLine();
        System.out.print("Ingrese la dedicacion: ");
        dedicacion = sc.nextLine();
    }
    
    @Override
    public void mostrarUsuario() {
        super.mostrarUsuario();
        System.out.println("ID Banner: " + idBanner);
        System.out.println("Departamento: " + departamento);
        System.out.println("Dedicacion: " + dedicacion);
    }
}
