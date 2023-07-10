/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Juridica pessoajuridica = new Juridica("565656565", "454545", "GagaBrait", "8848-5552");
        Fisica pessoafisica = new Fisica("565565", "54555", LocalDate.of(2003, Month.MARCH, 29), "huaus", "65559");
        System.out.println(pessoafisica.toString());
        System.out.println(pessoajuridica.toString());
    }
}
