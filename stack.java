import java.lang.*;
import java.util.*;

class stackstr{
    public int top;
    public int size;
    public Arraylist<Integer> st=new Arraylist<Integer>();
    stackstr(){
        top=-1;
        size=0;
    }
    stackstr(int n){
        top=-1;
        size=n;
    }
    public void push(int num){
        if(top==size-1)
            System.out.println("Overflow");
        else{
            st.add(num);
            ++top;
            ++size;
            System.out.println("Inserted successfully!");
        }
    }
    public void pop(){
        if(top==-1)
            System.out.println("Underflow");
        else{
            top--;
            size--;
            System.out.println("Deleted successfully!");
        }
    }
    public void display(){
        for(i=0; i<size; i++)
            System.out.print(st.get(i)+" ");
        System.out.println("");
    }
    public int get_size(){ return size; }
    public int get_top(){ return top; }
}
class stack{
    static void main(String []args){
        stackstr st;
        System.out.println("Empty Stack :");
        st.display();
        
    }
}

