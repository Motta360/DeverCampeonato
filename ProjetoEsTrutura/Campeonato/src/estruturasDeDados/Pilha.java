
package estruturasDeDados;

import entidades.Atleta;

public class Pilha {
    private Node topo = null;
    private int contador = 0;
    
    public boolean isEmpty(){
        return topo == null;
    }

    public int getContador() {
        return contador;
    }
    
    
    public boolean push(Object x){
        if(x != null){
            Node n1 = new Node(x, topo);
            topo = n1;
            contador+=1;
            return true;
        }else{
            return false;
        }
    }
    public Object peek(){
        if(!isEmpty()){
            return topo.getValue();
        }else{
            return null;
        }
    }
    public Object pop(){
        if(!isEmpty()){
            Object temp =  topo.getValue();
            topo = topo.getNext();
            contador-=1;
            return temp;
        }else{
            return null;
        }
    }
    
    @Override
    public String toString(){
        if(!isEmpty()){
            String msg = "";
            
            Node temp = topo;
            while(temp != null){
                msg= temp.getValue().toString()+ msg;
                temp = temp.getNext();
                if(temp!= null){
                    msg = "\n"+msg;
                }
            }
            return "P: "+msg;
        }else{
            return "P: ";
        }
    }
    
    public Atleta[] toArray(){
        if(isEmpty()) return null;
        Atleta[] lista = new Atleta[contador];
        Node temp = topo;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = ( Atleta) temp.getValue();
            temp = temp.getNext();
        }
        return lista;
    }
}
