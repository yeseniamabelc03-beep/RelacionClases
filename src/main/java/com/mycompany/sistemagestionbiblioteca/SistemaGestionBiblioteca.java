/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemagestionbiblioteca;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SistemaGestionBiblioteca {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Biblioteca biblioteca = new Biblioteca();
        int opcion = 0;

        do {
            System.out.println("_________SISTEMA BIBLIOTECA________");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Registrar Material");
            System.out.println("3. Consultar Materiales");
            System.out.println("4. Solicitar Prestamo");
            System.out.println("5. Mostrar Prestamos");
            System.out.println("6. Calcular multa de un material");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            try {
                opcion = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error, debe ingresar un numero");
                sc.nextLine();
                continue;
            }
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("____Crear Usuario_______");
                        System.out.println("1. Estudiante");
                        System.out.println("2. Docente");
                        System.out.print("Seleccione el tipo de usuario: ");
                        int tipo = sc.nextInt();
                        sc.nextLine();
                        Usuario usuario;
                        if (tipo == 1){
                            usuario = new Estudiante();
                        }
                        else {
                            usuario = new Docente();
                        }
                        usuario.ingresarUsuario();
                        biblioteca.agregarUsuario(usuario);
                        System.out.println("Usuario registrado");
                        break;

                    case 2:
                        System.out.println("______Registrar Material_____");
                        System.out.println("1. Libro");
                        System.out.println("2. Revista");
                        System.out.println("3. Tesis");
                        System.out.print("Seleccione el tipo de material: ");
                        int tipoMat = sc.nextInt();
                        sc.nextLine();
                        ArchivosBiblioteca material;
                     switch (tipoMat) {
                        case 1:
                            material = new Libro();
                            break;
                        case 2:
                            material = new Revista();
                            break;
                        default:
                            material = new Tesis();
                            break;
                    }
                        material.ingresarArchivo();
                        biblioteca.agregarArchivo(material);
                        System.out.println("Material registrado");
                        break;

                    case 3:
                        System.out.println("_____Consultar Materiales______");
                        biblioteca.mostrarMateriales();
                        break;

                    case 4:
                        System.out.println("____Solicitar Prestamo_____");
                        System.out.print("Ingrese la cedula del usuario: ");
                        int cedula = sc.nextInt();
                        sc.nextLine();
                        Usuario u = biblioteca.buscarUsuario(cedula);
                        u.solicitarPrestamo(biblioteca);
                        break;

                    case 5:
                        System.out.println("____Mostrar Prestamos___");
                        biblioteca.mostrarPrestamos();
                        break;

                    case 6:
                        System.out.println("____Calcular Multa_______");
                        biblioteca.calcularMultaMaterial();
                        break;

                    case 7:
                        System.out.println("Bye bye :)");
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            } catch (Excepciones.UsuarioNoEncontradoException | Excepciones.MaterialNoEncontradoException e) {
                System.out.println( e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            } finally {
            }
        } while (opcion != 7);

    }
}
