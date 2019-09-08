/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaestructuras;

/**
 *
 * @author Estudiantes
 */
public class Nodo {
    
    private Nodo next;
    private int info;

    public Nodo(Nodo siguiente, int info) {
        this.next = siguiente;
        this.info = info;
    }
    
    public Nodo( int info) {
        this.next = null;
        this.info = info;
    }
    
    public Nodo() {
        this.next = null;
    }
    
    public Nodo getSiguiente() {
        return next;
    }

    public void setSiguiente(Nodo siguiente) {
        this.next = siguiente;
    }

    public int getInfo() {
        return info;
    }
    
    public void setInfo(int info) {
        this.info = info;
    }

}
