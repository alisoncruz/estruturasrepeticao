package br.com.dio.exercicios;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] numeros = {-5, -6, 15, 50, 8, 4};

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i]+" ");
        }
    }
}
