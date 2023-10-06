/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocalculadora;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author joaoh
 */
public class Calculadora {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            TelaCalculadora tela = new TelaCalculadora();
            tela.setTitle("Calculadora");
            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tela.setSize(460, 600);
            tela.setVisible(true);

        });
    }

    public String calculadora(String expressao) {
        String resultado;
        List<Double> listaNumeros = new ArrayList<>();
        List<Character> listaOperadores = new ArrayList<>();

        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);

        resultado = calcularValor(listaNumeros, listaOperadores);

        return resultado;

    }

    private int getPrecedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0; // Operador desconhecido
    }

    private String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores) {
        List<Double> numerosTemp = new ArrayList<>();
        List<Character> operadoresTemp = new ArrayList<>();

        for (int i = 0; i < listaNumeros.size(); i++) {
            numerosTemp.add(listaNumeros.get(i));
            if (i < listaOperadores.size()) {
                char operador = listaOperadores.get(i);
                while (!operadoresTemp.isEmpty() && getPrecedence(operador) <= getPrecedence(operadoresTemp.get(operadoresTemp.size() - 1))) {
                    double numero2 = numerosTemp.remove(numerosTemp.size() - 1);
                    double numero1 = numerosTemp.remove(numerosTemp.size() - 1);
                    char op = operadoresTemp.remove(operadoresTemp.size() - 1);
                    numerosTemp.add(executarOperacao(numero1, op, numero2));
                }
                operadoresTemp.add(operador);
            }
        }

        while (!operadoresTemp.isEmpty()) {
            double numero2 = numerosTemp.remove(numerosTemp.size() - 1);
            double numero1 = numerosTemp.remove(numerosTemp.size() - 1);
            char op = operadoresTemp.remove(operadoresTemp.size() - 1);
            numerosTemp.add(executarOperacao(numero1, op, numero2));
        }

        return String.valueOf(numerosTemp.get(0));
    }

    private double executarOperacao(double numero1, char operador, double numero2) {
        double resultado = 0.0;

        switch (operador) {
            case '+' -> resultado = numero1 + numero2;
            case '-' -> resultado = numero1 - numero2;

            default -> System.err.println("Operador desconhecido: " + operador);
        }

        return resultado;
    }

    private List<Double> obterNumeros(String expressao) {

        List<Double> listaNumeros = new ArrayList<>();

        String numeroEmString = "";
        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
                numeroEmString = "";
            } else {
                numeroEmString = numeroEmString.concat("" + expressao.charAt(i));
            }
        }
        if (!numeroEmString.isEmpty()) {
            Double numero = Double.valueOf(numeroEmString);
            listaNumeros.add(numero);

        }
        return listaNumeros;
    }

    private List<Character> obterOperadores(String expressao) {

        List<Character> listaOperadores = new ArrayList<>();

        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                listaOperadores.add(expressao.charAt(i));
            }
        }

        return listaOperadores;
    }

    private boolean isOperador(char caracter) {
        boolean isOperador = false;
        if (caracter == '-' || caracter == '+') {
            isOperador = true;
        }
        return isOperador;
    }

}
