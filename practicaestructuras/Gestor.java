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
public class Gestor {

    private Listas list;
    private Pila pila;
    private Cola cola;
    //private Pila pile=null;
    
    public Gestor(){
        list = new Listas();
        pila = new Pila();
        cola = new Cola();
    }
    public String agregarElemList (int num){
        String msj = "";
        if(list.searchNum(num)){
            return msj = "este numero ya ha sido agregado";
        }else{ 
            if(list.insertNodo(num)){
                return msj = "se ha agregado:" + num;
            }else{
                return msj = "no se ha podido agregar el :" + num;
            }
        }
    }
   
    public void imprimirLista(){
        list.print();
    }
    
     public String borrarElemLista (int num){
        String msj = "";
        if(list.deleteInt(num)){
            return msj = "este numero ha sido eliminado";
        }else{ 
            return msj = "este numero no ha sido eliminado";
        }
    }
    
     public String agregarElemPila(int num){
        String msj = "";
       
        if(pila.push(num)){
            return msj = "se ha agregado:" + num;
        }else{
            return msj = "no se ha podido agregar el :" + num;
        }
        
    }
    
    public void imprimirPila(){
        pila.print();
    }
    
     public String borrarElemPila(){
        String msj = "";
        if(pila.pop()){
            return msj = "este numero ha sido eliminado";
        }else{ 
            return msj = "este numero no ha sido eliminado";
        }
    }
     
    public String agregarElemCola(int num){
        String msj = "";
       
        if(cola.insertarElem(num)){
            return msj = "se ha agregado:" + num;
        }else{
            return msj = "no se ha podido agregar el :" + num;
        }
        
    }
    
    public void imprimirCola(){
        cola.print();
    }
    
    public String eliminarElemCola(){
        String msj = "";
        if(cola.eliminar()){
            return msj = "este numero ha sido eliminado";
        }else{ 
            return msj = "este numero no ha sido eliminado";
        }
    }
     
    public String pasarColaLista(){
        String msj = "";
        int num = cola.atender();
        if(num != -1){
            list.insertNodo(num);
            cola.eliminar();
            return msj + "Agregado exitosamente";
        }else{
            return msj + "No hay ningun numero que pasar";
        }
    }
    
    public String pasarColaPila(){
        String msj = "";
        int num = cola.atender();
        if(num != -1){
            msj = this.agregarElemPila(num);
            cola.eliminar();
            return msj;
        }else{
            return msj + "la cola ya no tiene numero que pasar";
        }
    }
    
    public String  pasarPilaCola(){
        String msj = "";
        int num = pila.cima();
        if(num != -1){
            msj = this.agregarElemCola(num);
            pila.pop();
            return msj;
        }else{
            return msj + "la pila ya no tiene numero que pasar";
        }
    }
    
    public String  pasarPilaLista(){
        String msj = "";
        int num = pila.cima();
        if(num != -1){
            list.insertNodo(num);
            pila.pop();
            return msj + "agregado exitosamente";
        }else{
            return msj + "la pila ya no tiene numero que pasar";
        }
    } 
    
    public String  pasarListaCola(int num){
        String msj = "";
        if(list.searchNum(num)){
            msj = this.agregarElemCola(num);
            list.deleteInt(num);
            return msj;
        }else{
            return msj + "la lista ya no tiene numero que pasar";
        }
    }
    
    public String  pasarListaPila(int num){
        String msj = "";
        if(list.searchNum(num)){
            msj = this.agregarElemPila(num);
            list.deleteInt(num);
            return msj;
        }else{
            return msj + "la lista ya no tiene numero que pasar";
        }
    } 
    
    public void imprimirEstado(){
       list.imprimirEstado();
       cola.imprimirEstado();
       pila.imprimirEstado();
    }
}
