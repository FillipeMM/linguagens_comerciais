/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio03 {
    
    public static void main(String[] atgs){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String produto = scan.nextLine();
        System.out.printf("Digite a categoria do produto %s \n", produto);
        String categoria = scan.nextLine();
           
        switch(categoria){
            case "BEBIDA" : System.out.printf("%s eh de beber", produto); break;
            case "COMIDA" : System.out.printf("%s eh de comer", produto); break;
            default : System.out.printf("%s sem acoes de categoria", produto); break;
        }
        scan.close();
    
    }
    
    
    
}
