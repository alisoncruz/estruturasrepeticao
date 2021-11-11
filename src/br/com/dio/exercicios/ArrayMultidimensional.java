package br.com.dio.exercicios;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] numeros = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                int numero = random.nextInt(9);
                numeros[i][j] = numero;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]);
            }
            System.out.println();
        }
    }
}
