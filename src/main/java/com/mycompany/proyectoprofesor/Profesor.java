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
public class Profesor {
    private int id;
    private String nombre;
    private String apellido;
    private String departamento;
    //private Materia materias;

    private ArrayList<Materia> materias = new ArrayList<>(); 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /*public Materia getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materias) {
        this.materias = materias;
    }*/

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    Scanner sc = new Scanner(System.in);
    //metodos
    public void registrarProfesor(){
        System.out.print("Ingrese su id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese su departamento: ");
        departamento = sc.nextLine();
        System.out.println("Docente registrado con exito!!!!");
    }
    
    public void mostrarProfesor(){
        System.out.println("");
        System.out.println("Informacion Docente");
        System.out.println("Su id es " + nombre);
        System.out.println("Su nombre es " + nombre);
        System.out.println("Su apellido es " + apellido);
        System.out.println("Su departamento es " + departamento);
        System.out.println("_________________________");
        if(materias != null){
            System.out.println("Materias Asignadas");
            for (Materia m : materias){
                m.mostarMateria();
           } 
           }else{
                System.out.println("El docente no tiene esta materia");    
            } 
    }
    
    public void setMateria(Materia materia){
        materias.add(materia);
    }
}
