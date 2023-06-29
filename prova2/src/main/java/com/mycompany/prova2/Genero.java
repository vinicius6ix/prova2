/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova2;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO('M',"Masculino"), 
    FEMININO('F', "Feminino");
    
    private final char caractere;
    private final String texto;

    private Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }

  
   

    

}
