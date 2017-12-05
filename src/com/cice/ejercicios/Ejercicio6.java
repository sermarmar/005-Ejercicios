package com.cice.ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {

        int[] numeros={3,2,5,-3,2,4,4};
        int i=0;

        while(numeros[i]>=0){
            System.out.print(numeros[i]+" ");
            i++;
        }

        System.out.println("\nEl total de números recuperados: "+i);

    }
}
