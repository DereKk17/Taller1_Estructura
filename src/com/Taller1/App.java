package com.Taller1;

public class App {
    public static void main(String[] args) {
        int[] array = {4, 4, 5, 6, 7, 8, 10, 111111, 24};
        int[] array2 = {3, 4, 5, 6, 7, 8, 10,111111, 24};

        System.out.println(Funciones.comparar(Funciones.crearArreglo(10),Funciones.crearArreglo(10)));
        System.out.println(Funciones.comparar(array, array2));

        System.out.println();
        System.out.println(Funciones.comparacionRecursiva(Funciones.crearArreglo(10),Funciones.crearArreglo(10), 9));
        System.out.println(Funciones.comparacionRecursiva(array, array2, 8));
    }
}
