/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestionbiblioteca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Biblioteca {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<ArchivosBiblioteca> archivos = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<ArchivosBiblioteca> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<ArchivosBiblioteca> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Biblioteca() {
    }
    
    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void agregarArchivo(ArchivosBiblioteca a) {
        archivos.add(a);
    }

    public ArchivosBiblioteca buscarArchivo(String tituloBuscado) throws Excepciones.MaterialNoEncontradoException {
        for (ArchivosBiblioteca t : archivos) {
            if (t.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                return t;
            }
        }
        throw new Excepciones.MaterialNoEncontradoException("Material " + tituloBuscado + " no encontrado");
    }

    public void mostrarMateriales() {
      boolean hayMateriales = false;  
        for (ArchivosBiblioteca m : archivos) {
          hayMateriales = true;       
          m.MostrarInfo();
        }
        if (hayMateriales) {
        } else {
          System.out.println("No hay materiales registrados");
        }
     }

    public void crearPrestamo(Usuario u, ArchivosBiblioteca archivo) throws Excepciones.MaterialNoPrestadoException {
        if (!archivo.PrestamoPermitir()) {
            throw new Excepciones.MaterialNoPrestadoException("La tesis no puede prestarse");
        }
        Prestamo p = new Prestamo();
        p.setUsuario(u);
        p.setArchivo(archivo);
        p.ingresarPrestamo();
        prestamos.add(p);
        System.out.println("Prestamo registrado");
    }

    public void mostrarPrestamos() {
       boolean mprestamos = false; 
        for (Prestamo p : prestamos) {
            mprestamos = true;       
            p.mostrarPrestamo();
        }
        if (mprestamos) {
        } else {
        System.out.println("No hay prestamos registrados");
        }
    }
    
        Scanner sc = new Scanner(System.in);
        public void calcularMultaMaterial() {
        try {
            System.out.print("Ingrese el titulo del material: ");
            String titulo = sc.nextLine();
            ArchivosBiblioteca material = buscarArchivo(titulo);
            int dias;
            while (true) {
        try {
            System.out.print("Ingrese los dias de retraso: ");
            dias = sc.nextInt();
            if (dias <= 0) {
                System.out.println(" Los dias deben ser positivos");
                continue;
            }
        sc.nextLine();
        break;
        } catch (InputMismatchException e) {
        System.out.println("Debe ingresar solo numeros");
        sc.nextLine();
            }
        }
            material.CalcularMulta(dias);
            System.out.println("Multa: " + material.getMulta());
        } catch (Excepciones.MaterialNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
        
        public Usuario buscarUsuario(int cedula) throws Excepciones.UsuarioNoEncontradoException {
        for (Usuario u : usuarios) {
            if (u.getCedula() == cedula) {
                return u;
            }
        }
        throw new Excepciones.UsuarioNoEncontradoException("Usuario con cedula " + cedula + " no existe");
    }
}
