/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprofesor;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Estudiante {
    private String nombre;
    private String id;
    private double nota; 
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    Scanner sc = new Scanner(System.in); 
    public void ingresarEstudiante(){
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el id del estudiante: ");
        id = sc.nextLine();
        System.out.print("Estado: "); //matriculado, retirado, expulsado
        estado = sc.nextLine();
        System.out.print("Estudiante Registrado!!!!!!!!!");
    }
    
    
    public void mostraEstudiante(){
        System.out.println("Informacion estudiante");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Id: "+ id);
        System.out.println("Estado: "+ estado);
        System.out.println("_________________________");
    }
    
    public void Aprobar(){
        System.out.print("Ingrese el numero de notas: ");
        int n = sc.nextInt();
        double sum=0;
        for(int i =0; i<n; i++){
        System.out.print("Ingrese la " +(i+1)+ " nota : ");
        nota = sc.nextDouble();
        sum = sum +nota;
        }
        double promedio = sum /n;
            if(promedio >= 14){
                System.out.println("Aprobado");
                System.out.println("El promedio es: " + promedio);
            }else{
                System.out.println("Reprobado");
                System.out.println("El promedio es: " + promedio);
            }
        
    }
}
