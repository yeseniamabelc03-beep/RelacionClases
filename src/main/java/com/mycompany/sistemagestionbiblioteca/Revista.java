/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestionbiblioteca;

/**
 *
 * @author USER
 */
public class Revista extends ArchivosBiblioteca implements IPrestamo{
    private String ISSN;
    private String volumen;

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public Revista(String ISSN, String volumen, String titulo, String autor, int anioPublicacion, int multa) {
        super(titulo, autor, anioPublicacion, multa);
        this.ISSN = ISSN;
        this.volumen = volumen;
    }

    public Revista() {
    }

    @Override
    public void ingresarArchivo(){
        super.ingresarArchivo();
        System.out.print("Ingrese el ISSN: ");
        ISSN = sc.nextLine();
        System.out.print("Ingrese el volumen: ");
        volumen = sc.nextLine();
     }   
    
    @Override
    public void CalcularMulta(int diasRetraso) {
        if (diasRetraso <= 0) {
        throw new IllegalArgumentException("Los dias de retraso deben ser mayores a 0");
    }
        multa += diasRetraso * 10;  
    }

    @Override
    public void MostrarInfo() {
        super.mostrarArchivo();
        System.out.println("ISSN: " + ISSN);
        System.out.println("Volumen: " + volumen);
        System.out.println("Multa: " + multa);
    }
    
    @Override
    public void prestar() {
        System.out.println("La revista ha sido prestada");
    }

    @Override
    public void devolver() {
        System.out.println("La revista ha sido devuelta");
    }
    
    @Override
    public boolean PrestamoPermitir() {
        return true;
    }
}
