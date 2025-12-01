/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestionbiblioteca;


/**
 *
 * @author USER
 */
public class Tesis extends ArchivosBiblioteca {
    private String idioma;
    private String tipoTesis;
    private String universidad;
    private String departamento;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTipoTesis() {
        return tipoTesis;
    }

    public void setTipoTesis(String tipoTesis) {
        this.tipoTesis = tipoTesis;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Tesis(String idioma, String tipoTesis, String universidad, String departamento, String titulo, String autor, int anioPublicacion, int multa) {
        super(titulo, autor, anioPublicacion, multa);
        this.idioma = idioma;
        this.tipoTesis = tipoTesis;
        this.universidad = universidad;
        this.departamento = departamento;
    }

    public Tesis() {
    }
    
    @Override
    public void ingresarArchivo(){
        super.ingresarArchivo();
        System.out.print("Ingrese el idioma de la tesis: ");
        idioma = sc.nextLine();
        System.out.print("Ingrese el tipo de tesis: ");
        tipoTesis = sc.nextLine();
        System.out.print("Ingrese la universidad: ");
        universidad = sc.nextLine();
        System.out.print("Ingrese el departamento: ");
        departamento = sc.nextLine();
     }   
    
    @Override
    public void CalcularMulta(int diasRetraso) {
        if (diasRetraso <= 0) {
        throw new IllegalArgumentException("Los dias de retraso deben ser mayores a 0");
    }
        multa += diasRetraso * 15; 
    }

    @Override
    public void MostrarInfo() {
        super.mostrarArchivo();
        System.out.println("Idioma: " + idioma);
        System.out.println("Tipo de tesis: " + tipoTesis);
        System.out.println("Universidad: " + universidad);
        System.out.println("Departamento: " + departamento);
        System.out.println("Multa: " + multa);
    }
    
    @Override
    public boolean PrestamoPermitir() {
        return false;
    }
}
