/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
// extends significa que é esta classe é uma extenção da classe Pessoa
public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    
    
    public Fisica(String cpf, String rg, LocalDate dataNascimento, String nome, String telefone) {
        super(nome, telefone); // super = superior; as informações vem da classe superior Pessoa
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears(); 
    } // get idade para calculo da idade utilizando a data atual
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + //para as infomacoes de Pessoa aparecer na tela
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nData de nascimento: " + dataNascimento + 
                "\nIdade: " + this.getIdade(); // this = está nesta classe.
    }




}
