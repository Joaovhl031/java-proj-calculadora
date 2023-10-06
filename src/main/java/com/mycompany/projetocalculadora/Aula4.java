/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocalculadora;
/**
 *
 * @author joaoh
 */

    
public class Aula4 {

    public static void main(String[] args) {
        Calculo calc = new Calculo();
        
       calc.setInserirDados();
        System.out.println("O resultado da soma é: "+calc.getSoma());
        System.out.println("A raiz quadrada de "+calc.getSoma()+" é : "+calc.getRaiz());

    }
    
}
