package org.example.algoritmos_tarea2;

import java.util.ArrayList;

public class Pila {
    private String cadena;

    public static void main(String[] args) {

        pilasEjercicio<Character> pilas = new pilasEjercicio<>();

        pilas.push('h');
        pilas.push('o');
        pilas.push('l');
        pilas.push('a');

        for(int i=0;i==4;i++){
            System.out.println(pilas.pop()+" ");
        }

        pilas.invierteCadena();

        for(int i=0;i==4;i++){
            System.out.println(pilas.pop()+" ");
        }
    }


    //EJERCICIOS

    //invierte lo escrito en una cadena y lo devuelve
    public void invierteCadena(){

        int topeTemp = tope;

        for(int i=0;i<tope;i++){
            pilas[i]= pila.pop();
        }

        tope=topeTemp; //regresamos con nuestro tope original
        return cadena.toString();
    }


    //Hacer un metodo que reciba una cadena del tipo {[()]}
    //Que verifique que la cantidad de elementos en correcta y que existe concordancia entre los pares
    public boolean revisarSintaxis(T[] cadena){

        return false;
    }

    //ordena de menor a mayor un vector de numeros
    public String ordenarNumeros(T[] cadena){
        return cadena.toString();
    }
}