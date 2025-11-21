/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoprofesor;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ProyectoProfesor {

    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        Materia materia = new Materia();
        Estudiante estudiante = new Estudiante();
        Scanner sc = new Scanner (System.in);
        boolean continuar = true;
        int op;
        do{
            System.out.println("MENU");
            System.out.println("1. Registar Profesor");
            System.out.println("2. Registar Materia");
            System.out.println("3. Asignar Materia");
            System.out.println("4. Mostrar Profesor");
            System.out.println("5. Registar Estudiante");
            System.out.println("6. Asignar Estudiante");
            System.out.println("7. Calcular promedio Estudiante");
            System.out.print("Digite opciones: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1: profesor.registrarProfesor(); break;
                case 2: materia.registarMateria(); break;
                case 3: if(materia.getNombre() != null){ // prof != null || mat !=null
                    profesor.setMateria(materia);
                    System.out.println("Materia Asignada");
                }else{
                    System.out.println("No se puede asignar la materia");
                }break;
                case 4 : if(profesor.getNombre() != null){  // prof != null
                    profesor.mostrarProfesor();
                }else{
                    System.out.println("Ningun docente registrado");
                }break;
                case 5: if(profesor.getMaterias() != null){
                    estudiante.ingresarEstudiante();
                }else{
                    System.out.println("El docente no esta registrado o no esta asignado en la materia");
                }break;
                case 6: if(estudiante.getId() != null){
                    materia.asignarEstudiante(estudiante);
                    System.out.println("Estudiante Asignado");
                }else{
                    System.out.println("No hay estudiante registrado");
                }break;
                case 7: if(estudiante.getId() != null){
                    estudiante.Aprobar();
                }else{
                    System.out.println("No hay estudiante registrado");
                }break;
                default :
                    continuar = false;
                    break;
            }             
        }while(continuar);
    }
}
