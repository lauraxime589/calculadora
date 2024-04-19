package com.example;


public class AdaptadorCalculadora implements calculadoraEnteros {
    private CalculadoraDecimales calcularDecimal;

    @Override
    public int suamr(int num1, int num2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'suamr'");
    }

    public AdaptadorCalculadora(CalculadoraDecimales calcularDecimal) {
        this.calcularDecimal = calcularDecimal;
    }
}
   @Override
   public int sumar(int num1, int num2)
    double resultadoDecimal = CalculadoraDecimales.sumar((double) num1, (double) num2);
       return (int) resultadoDecimal;
   
