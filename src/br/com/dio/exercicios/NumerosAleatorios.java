package br.com.dio.exercicios;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int count = 0;
        int[] numeros = new int[20];

        while(count < 20){
            numeros[count] = random.nextInt(100);
            count++;
        }

        for(Integer numero: numeros){
            System.out.println(numero+" sucessor: "+(numero+1));
        }


    }
}
