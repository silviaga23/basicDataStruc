/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaestructuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaEstructuras {

    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        boolean out = false;
        int option; //Guardaremos la opcion del usuario
        int num;
        Gestor g1 = new Gestor();
        
 
        while (!out) {

            System.out.println("1. Agregar un elemento a una lista");
            System.out.println("2. Agregar un elemento a la pila");
            System.out.println("3. Agregar elemento cola");
            System.out.println("4. Pasar de cola a lista");
            System.out.println("5. Pasar de cola a pila");
            System.out.println("6. Pasar de pila a lista");
            System.out.println("7. Pasar de pila a cola");
            System.out.println("8. Pasar de lista a cola");
            System.out.println("9. Pasar de lista a pila");
            System.out.println("10. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        System.out.println("Digita el entero a agregar a la lista: ");
                        num = sn.nextInt();
                        System.out.println(g1.agregarElemList(num));
                        g1.imprimirLista();
                        break;
                    case 2:
                        System.out.println("Digita el entero a agregar a la pila");
                        num = sn.nextInt();
                        System.out.println(g1.agregarElemPila(num));
                        g1.imprimirPila();
                        break;
                    case 3:
                        System.out.println("Digita el entero a agregar a la cola");
                        num = sn.nextInt();
                        System.out.println(g1.agregarElemCola(num));
                        g1.imprimirCola();
                        break;
                    case 4:
                        System.out.println("// Pasando de cola a lista // ");
                        System.out.println(g1.pasarColaLista());
                        g1.imprimirEstado();
                        break;
                    case 5:
                        System.out.println("// Pasando de cola a pila // ");
                        System.out.println(g1.pasarColaPila());
                        g1.imprimirEstado();
                        break;
                    case 6:
                        System.out.println("// Pasando de pila a lista // ");
                        System.out.println(g1.pasarPilaLista());
                        g1.imprimirEstado();
                        break;
                    case 7:
                        System.out.println("// Pasando de pila a cola // ");
                        System.out.println(g1.pasarPilaCola());
                        g1.imprimirEstado();
                        break;
                    case 8:
                        System.out.println("// Pasando de lista a cola // ");
                        g1.imprimirLista();
                        System.out.println("Debe seleccionar el entero de la lista anterior que desea pasar a la cola");
                        num = sn.nextInt();
                        System.out.println(g1.pasarListaCola(num));
                        g1.imprimirEstado();
                        break;
                    case 9:
                        System.out.println("// Pasando de lista a pila // ");
                        g1.imprimirLista();
                        System.out.println("Debe seleccionar el entero de la lista anterior que desea pasar a la lista");
                        num = sn.nextInt();
                        System.out.println(g1.pasarListaPila(num));
                        g1.imprimirEstado();
                        break;
                    case 10:
                        out = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 10");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
