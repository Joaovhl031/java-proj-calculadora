/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocalculadora;

import java.util.Scanner;

/**
 *
 * @author joaoh
 */
public class Calculo {

    private int valor1;
    private int valor2;
    private int resultadoSoma;
    private double resultadoRaiz;

    public Calculo() {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultadoRaiz = resultadoRaiz;
        this.resultadoSoma = resultadoSoma;
    }

    public void setInserirDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        this.valor1 = entrada.nextInt();
        System.out.println("Digite outro valor: ");
        this.valor2 = entrada.nextInt();
    }

    public int getSoma() {
        resultadoSoma = valor1 + valor2;
        return resultadoSoma;
    }

    public double getRaiz() {
        resultadoRaiz = Math.sqrt(resultadoSoma);
        return resultadoRaiz;
    }

}
