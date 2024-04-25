
package estruturasDeDados;

import entidades.Atleta;
import java.util.ArrayList;

public class Fila {
    private Node head = null, tail = null;
    private int contador =0;
    
    public boolean isEmpty(){
        return head == null;
    }

    public int getContador() {
        return contador;
    }
    
    public Object peek(){
        if(!isEmpty()){
            return head.getValue();
        }else{
            return null;
        }
    }
    
    public Object enqueue(Object x){
        if(x == null){
            return null;
        }
        else{
            try {
                Node n1 = new Node(x, null);
                if(tail == null){
                    head = n1;tail = n1;
                }else{
                    tail.setNext(n1);
                    tail = n1;
                }
            } catch (Exception e) {
                return null;
            }
            contador+=1;
            return x;
        }
    }
    public Object dequeue(){
        if(!isEmpty()){
            try {
                Object temp = head.getValue();
            head = head.getNext();
            if(head == null){
                tail = null;
            }
            contador-=1;
            return temp;
            } catch (Exception e) {
                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            String msg = "";
            Node temp = head;
            while(temp != null){
                msg+= temp.getValue().toString() ;
                temp = temp.getNext();
            if (temp!= null) {
                msg+= "\n";
            }
        }
        return "f: "+msg;
            
        }
        else{
            return "f:";
        }
    }
    
    public Atleta[] toArray(){
        if(isEmpty()) return null;
        Atleta[] lista = new Atleta[contador];
        Node temp = head;
        for (int i = 0; i < contador; i++) {
            lista[i] = (Atleta) temp.getValue();
            temp = temp.getNext();
        }
        return lista;
        
    }
   
    
}
