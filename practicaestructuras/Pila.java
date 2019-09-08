/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaestructuras;

/**
 *
 * @author nandi
 */
public class Pila {
    
    private int leng;
    private Nodo tope;

      
    public Pila(){
        leng=0;
        tope=null;
    }
    
    public int getLeng() {
        return leng;
    }

    public void setLeng(int leng) {
        this.leng = leng;
    }

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }

    public boolean push(int num){
        Nodo newNodo = new Nodo(num);
        if(newNodo==null){
            return false;
        }else{
            if(this.estaVacia()){
                this.setTope(newNodo);
            }else{
                newNodo.setSiguiente(this.getTope());
                this.setTope(newNodo);
            }
            this.leng++;
            return true;
        }
        
    }
    public boolean pop(){
        
        if(!this.estaVacia()){
            Nodo aux = this.getTope();
            this.setTope(this.getTope().getSiguiente());
            aux.setSiguiente(null);
            leng--;
            return true;
        }else{
            return false;
        }
    }
    
    public int cima(){
        if(this.estaVacia()){
            return -1;
        }else{
            return this.getTope().getInfo();
        }
    }
    
    public boolean estaVacia(){
        return tope == null; 
    }
    
        //imprime elementos
    public void print() {
        Nodo aux = this.getTope();
        System.out.println("Pila:");
        while(aux !=null){
            System.out.println(aux.getInfo());
            aux=aux.getSiguiente();
        }
    }
    
    public void imprimirEstado(){
        if(this.estaVacia()){
            System.out.println("La Pila esta vacia, su longitud es" + this.getLeng());
        }else{
            System.out.println("Pila:\n Longitud=" + this.getLeng() + ", \n Tope: " + this.getTope().getInfo());
            this.print();
        }
    }
    
    
}
