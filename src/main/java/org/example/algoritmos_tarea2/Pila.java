package org.example.algoritmos_tarea2;

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

            //ejercicio 3
            System.out.println(cadena.invierteCadena("hola"));

            //ejercicio 4
            System.out.println(cadena.revisarSintaxis("{()}"));

            //ejercicio 5
            int[] numeros = {5, 2, 1, 9, 3, 4, 11, 10};

            pilasEjercicio<Integer> resultado = cadena.ordenarNumeros(numeros);

            //mientras la pila no este vacia estaremos imprimiendo los resultados ya ordenados
            while(!resultado.pilaVacia()){
                System.out.print(resultado.pop() + " ");
            }
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

            pilasEjercicio<Character> pilas = new pilasEjercicio<>();

            for(int i = 0; i < cadena.length(); i++){

                char c = cadena.charAt(i);

                //primero verificamos si abren, sisi entonces lo metemos a la pila
                if(c == '(' || c == '{' || c == '['){
                    pilas.push(c);
                }

                //Si cierran verificamos que cierre bien
                else if(c == ')' || c == '}' || c == ']'){

                    //Si no hay nada que comparar entonces error
                    if(pilas.pilaVacia()){
                        return false;
                    }

                    //para revisar caracteres
                    char abierto = pilas.pop();

                    //Compararamos pares
                    if(c == ')' && abierto != '('){
                        return false;
                    }
                    if(c == '}' && abierto != '{'){
                        return false;
                    }
                    if(c == ']' && abierto != '['){
                        return false;
                    }
                }
            }

            //Si sale bien regresa true, si hubo partes incompletas entonces false
            return pilas.pilaVacia();
        }


        //ordena de menor a mayor un vector de numeros
        public pilasEjercicio<Integer> ordenarNumeros(int[] vector){

            pilasEjercicio<Integer> pilaOrdenada = new pilasEjercicio<>();
            pilasEjercicio<Integer> pilaAux = new pilasEjercicio<>();

            for(int i = 0; i < vector.length; i++){

                int numero = vector[i]; // Tomamos el número actual

                //Mientras la pila no esté vacía, y que el número en el tope sea mayor que el número actual
                //entonces sacaremos los menores y los pasamos a la pila auxiliar
                while(!pilaOrdenada.pilaVacia() &&
                        (Integer)pilaOrdenada.getPila()[pilaOrdenada.getTope()] < numero){

                    pilaAux.push(pilaOrdenada.pop());
                }

                //Ahora sí metemos el número en su posición correcta
                pilaOrdenada.push(numero);

                //Regresamos los números que habíamos quitado para repetir el proceso de ordenar
                while(!pilaAux.pilaVacia()){
                    pilaOrdenada.push(pilaAux.pop());
                }
            }

            //Regresamos la pila ya ordenada
            return pilaOrdenada;
        }

}