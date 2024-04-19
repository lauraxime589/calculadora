package com.example;

public class Main {
    public static void main(String[] args){
    }
    
}
Calculadora calculadora = new Calculadora();
int resultadoEntero = calculadora.sumar(5, 3);
 System.out.println("resultado de la suma de enteros: " + resultadoEntero);

 CalculadoraDecimales calculadoraDecimales = new CalculadoraDecimal();

 AdaptadorCalculadora adaptador = new AdaptadorCalculadora(calculadoraDecimales);
 int resultadoDecimal = (int) adaptador.sumar(5, 3);
  System.out.println("resulatdo de la suma de decimales: " + resultadoDecimal);
