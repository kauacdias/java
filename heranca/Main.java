/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("555", "Jorge", "26662222", "222695323", 5000);
        Medico medico = new Medico("52041", "Jorgin", "5459899856", "13523622", 5000);
        Motoboy motoboy = new Motoboy("4855323", "Jorginho", "23333411", "221215411", 5000);
        
        System.out.println(engenheiro);
        System.out.println("");
        System.out.println(medico);
        System.out.println("");
        System.out.println(motoboy);
    }
}
