/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestionbiblioteca;

/**
 *
 * @author USER
 */
    public class Excepciones {
       public static class UsuarioNoEncontradoException extends Exception {
        public UsuarioNoEncontradoException(String msg) {
            super(msg);
        }
    }

    public static class MaterialNoEncontradoException extends Exception {
        public MaterialNoEncontradoException(String msg) {
            super(msg);
        }
    }

    public static class MaterialNoPrestadoException extends Exception {
        public MaterialNoPrestadoException(String msg) {
            super(msg);
        }
    }

}
