package org.example.algoritmos_tarea2;

import java.util.ArrayList;

public class Pila {
        private String cadena;

        public static void main(String[] args) {

            //PRUEBA PUSH Y POP!!!
            /*
            pilasEjercicio<Character> pilas = new pilasEjercicio<>();

            pilas.push('h');
            pilas.push('o');
            pilas.push('l');
            pilas.push('a');

            for(int i=0;i==4;i++){
                System.out.println(pilas.pop()+" ");
            }
            */

            Pila cadena = new Pila();
            System.out.println(cadena.invierteCadena("hola"));
        }


        //EJERCICIOS

        //invierte lo escrito en una cadena y lo devuelve
        public String invierteCadena(String texto){

            pilasEjercicio<Character> pilas = new pilasEjercicio<>();

            //metemos la cadena en una pila
            for(int i = 0; i < texto.length(); i++){
                pilas.push(texto.charAt(i));
            }

            String invertida = "";

            //metemos al reves la pila a otra cadena
            while(!pilas.pilaVacia()){
                invertida = invertida + pilas.pop();
            }

            return invertida;
        }


    //Hacer un metodo que reciba una cadena del tipo {[()]}
    //Que verifique que la cantidad de elementos en correcta y que existe concordancia entre los pares
    public boolean revisarSintaxis(String cadena){

        return false;
    }

    //ordena de menor a mayor un vector de numeros
    public pilasEjercicio<Integer> ordenarNumeros(int[] vector){

        return null;
    }

}