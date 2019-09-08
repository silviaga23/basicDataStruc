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
public class Listas {
    
    private Nodo head;
    private int quant;

    public Listas(Nodo head) {
        this.head = head;
    }
    
     public Listas() {
        super();
        head = null;
        quant = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }
    
    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    //inserta ordenado
    public boolean insertNodo(int info){
        Nodo newNodo = new Nodo(null,info);
        if(newNodo== null){
            return false;
        }else{
            if(this.getHead()==null){
                this.setHead(newNodo);
            }else{
                if(newNodo.getInfo()<this.getHead().getInfo()){
                    newNodo.setSiguiente(this.getHead());
                    this.setHead(newNodo);
                }else{
                    addInOrder(newNodo);
                }
            }
            quant++;
            return true;
        }
    }
    
    private void addInOrder(Nodo newNodo){
        Nodo aux = this.getHead();
        while(aux.getSiguiente() !=null){
            if(aux.getSiguiente().getInfo()>newNodo.getInfo()){
                newNodo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(newNodo);
                break;
            }else{
                aux=aux.getSiguiente();
            }
        }
        aux.setSiguiente(newNodo);
    }
    public boolean searchNum(int num){
        Nodo aux = this.getHead();

        while(aux !=null){
            if(aux.getInfo() == num){
                return true;
            }else{
                aux=aux.getSiguiente();
            }
        }
        return false;
    }

    //imprime elementos
    public void print() {
        Nodo aux = this.getHead();
        System.out.println("Lista:");
        while(aux !=null){
            System.out.println(aux.getInfo());
            aux=aux.getSiguiente();
        }
    }
    
    public boolean deleteInt(int num){
        Nodo aux = this.getHead();
        Nodo ant = new Nodo();
        ant = null;

        while(aux!=null){
            if(aux.getInfo()==num){
                if(aux == this.getHead()){
                    this.setHead(this.getHead().getSiguiente());
                }else{
                    ant.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                }
                quant--;
                return true;
            }
            ant=aux;
            aux=aux.getSiguiente();
        }
        return false;
    }
    
    public boolean estaVacia(){
        return head == null; 
    }
    
    public void imprimirEstado(){
        if(this.estaVacia()){
            System.out.println("La Lista esta vacia, su longitud es" + this.getQuant());
        }else{
            System.out.println("Lista:\n Longitud=" + this.getQuant()+ ", \n Cabeza: " + this.getHead().getInfo());
            this.print();
        }
    }

}
