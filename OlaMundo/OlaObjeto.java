/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OlaMundo;

/**
 *
 * @author aluno
 */
public class OlaObjeto {
    
    public static void main(String[] args){
        OlaObjeto pessoa = new OlaObjeto();
        OlaObjeto objeto = new OlaObjeto();
        objeto.imprimir(objeto.palavra);
        pessoa.imprimir(pessoa.nome);
    
    }
    
    String palavra = "mundo";
    String nome = "Fillipe";
    
    void imprimir(String palavra){
        System.out.println("Ola "+ palavra );
    
    }
    
    
}
