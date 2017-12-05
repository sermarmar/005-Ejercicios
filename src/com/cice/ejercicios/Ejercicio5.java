package com.cice.ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros={1,3,2,4,5,12,5};
        int result=0;

        for(int n:numeros){
            result+=n;
        }

        System.out.println("La suma de los números: "+result);
    }
}
