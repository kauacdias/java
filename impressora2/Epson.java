/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora2;

/**
 *
 * @author Aluno
 */
public class Epson implements Impressora {

    @Override
    public void imprimir() {
        System.out.println(" ---- IMPRESSORA EPSON ---");
        System.out.println("Preparando cartuchos");
        System.out.println("Imprimindo...");
    }
    
}
