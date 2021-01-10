/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author sergiohernandez
 */
class Pares extends Thread {

    public static void main(String[] args) {

        long TInicio = System.currentTimeMillis();//Variables para determinar el tiempo de ejecución
        int numero = 1;
        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println("Numero:  \t" + numero + "\n");
            }
            numero++;
        }
        long TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo
        System.out.println("Tiempo de ejecución en segundos " + (TFin - TInicio) +"\n");//Imprime el mensaje en segundos Haciendo la comparación
        System.out.println("*****Números pares en Java*****\n");
    }

}

     