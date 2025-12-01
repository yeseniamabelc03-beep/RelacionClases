/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprofesor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Materia {
    private String NRC;
    private String nombre;
    private int horas;
    private String carrera;

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    Scanner sc = new Scanner (System.in);
    public void registarMateria(){
        System.out.print("Ingrese su NRC: ");
        NRC = sc.nextLine();
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese las horas: ");
        horas = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese su carrera: ");
        carrera = sc.nextLine();
        System.out.println("Materia Registrada");
    }
    
    public void mostarMateria(){
        System.out.println("Informacion materia");
        System.out.println("NRC: "+ NRC);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Horas: "+ horas);
        System.out.println("Carrera: "+ carrera);
        System.out.println("_________________________");
        
        if(estudiantes != null){
           System.out.println("Estudiante asignado");
           for(Estudiante est : estudiantes){
               est.mostraEstudiante();
           }
       }else{
           System.out.println("No hay estudiantes registrados");
       }      
    }
    
    public void asignarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    
}
