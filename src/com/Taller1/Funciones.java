package com.Taller1;

public class Funciones {
    static int[] crearArreglo(int size){
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = (int)((Math.random() * (5000 - 0)) + 0);
        }
        return array;
    }

    static boolean comparar(int[] arreglo1, int[] arreglo2){
        boolean a = true;
        for(int i = 0; i < 3; i++){
            if(arreglo1[i] != arreglo2[i]){
                a = false;
            }

        }
        return a;
    }

    static boolean comparacionRecursiva(int[] arreglo, int[] arreglo2, int i){
        if(i == 0){
            return true;
        }else
            return arreglo[i] == arreglo2[i] && comparacionRecursiva(arreglo,arreglo2, i - 1);
    }

}
