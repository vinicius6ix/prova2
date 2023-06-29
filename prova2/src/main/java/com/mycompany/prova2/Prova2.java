

package com.mycompany.prova2;

import java.time.LocalDate;
import java.time.Month;



public class Prova2 {

    public static void main(String[] args) {
        
         Endereco endereco  = new Endereco("bairro", "24694", "ao lado do condominio offour", "24694.024", "maldivas", UnidadeFederativa.RIO_DE_JANEIRO);
        Motoboy motoboy = new Motoboy("12345678910", "Curry", "444.444.444.24", "444444.444", endereco, Setor.OPERACOES, Genero.MASCULINO, 1500, EstadoCivil.VIUVO, LocalDate.of(-401, Month.MAY, 4));
        Engenheiro engenheiro = new Engenheiro("3342424e", "Maxey", "444.440.446.94", "44469.444", endereco, Setor.OPERACOES, Genero.MASCULINO, 2500, EstadoCivil.CASADO, LocalDate.of(-401, Month.MAY, 24));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Giannis", "444444444", "444444444", endereco, Setor.SAUDE, Genero.FEMININO, 4000, EstadoCivil.CASADO, LocalDate.of(-401, Month.APRIL, 24));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Embiid", "4324235334.532", "332434222", endereco, Setor.SAUDE, Genero.FEMININO, 5000, EstadoCivil.CASADO, LocalDate.of(-401, Month.APRIL, 22));
       
                
                
                System.out.println("dados do motoboy:" + motoboy.toString());
                System.out.println("");
                System.out.println("dados do engenheiro: " + engenheiro.toString());
                System.out.println("");
                System.out.println("");
                System.out.println("dados do gerente:" + gerente.toString());
                System.out.println("");
                System.out.println("dados do diretor" + diretor.toString());
          
             
                
                
                
             
                
                
    }
}

