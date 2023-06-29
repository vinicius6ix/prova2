/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public  class Diretor extends CargoDeConfianca implements Contratacao {
    
    private  double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
 
  
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return super.toString()+ 
                "\n PREMIO:" + PREMIO ;
    }


    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo o Funcionário:" );
       
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo o Funcionário");
        

    } 
    
    
}
