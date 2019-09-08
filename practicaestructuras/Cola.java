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
public class Cola {
    
    private Nodo frente;
    private Nodo finalE;
    private int lenghtC;
    
    public Cola(){
        frente = null;
        finalE = null;
        lenghtC = 0;
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getFinalE() {
        return finalE;
    }

    public void setFinalE(Nodo finalE) {
        this.finalE = finalE;
    }

    public int getLenghtC() {
        return lenghtC;
    }

    public void setLenghtC(int lenghtC) {
        this.lenghtC = lenghtC;
    }
    
    public boolean estaVacia(){
        return frente == null; 
    }
    
    public boolean insertarElem(int num){
        Nodo newNodo = new Nodo(num);
        if(this.estaVacia()){
            this.setFrente(newNodo);
            this.setFinalE(newNodo);
        }else{
            this.getFinalE().setSiguiente(newNodo);
            this.setFinalE(newNodo);
        }
        
        lenghtC++;
        return true;
    }
    
    public int atender(){
        if(!this.estaVacia()){
            return this.getFrente().getInfo();
        }else{
            return -1;
        }
    }
    public boolean eliminar(){
        if(!this.estaVacia()){
            Nodo elim = this.getFrente();
            this.setFrente(this.getFrente().getSiguiente());
            elim.setSiguiente(null);
            lenghtC--;
            return true;
        }else{
            return false;
        }
    }
    
        //imprime elementos
    public void print() {
        Nodo aux = this.getFrente();
        System.out.println("Cola:");
        while(aux !=null){
            System.out.println(aux.getInfo());
            aux=aux.getSiguiente();
        }
    }
    
    public void imprimirEstado(){
        if(this.estaVacia()){
            System.out.println("La cola esta vacia, su longitud es" + this.getLenghtC());
        }else{
            System.out.println("Cola:\n Longitud=" + this.getLenghtC() + ", \n Elemento Inicial: " + this.getFrente().getInfo() + ",\n Elemento Final: " + this.getFinalE().getInfo());
            this.print();
        }
    }
}
