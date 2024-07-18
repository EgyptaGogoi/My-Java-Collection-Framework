import java.lang.*;
import java.util.*;
import java.io.*;

class stackstr{
    public int top;
    public int size;
    ArrayList<Integer> st=new ArrayList<Integer>();
    stackstr(int n){
        top=-1;
        size=n;
    }
    public void push(int num){
        if(top==size)
            System.out.println("Overflow");
        else{
            st.add(num);
            top++;
            System.out.println("Inserted successfully!");
        }
    }
    public void pop(){
        if(top==-1)
            System.out.println("Underflow");
        else{
            top--;
            System.out.println("Deleted successfully!");
        }
    }
    public void display(){
        for(int i=top; i>=0; i--)
            System.out.print(st.get(i)+" ");
        System.out.println("");
    }
    public int get_size(){ return size; }
    public int get_top(){ return top; }
}
class stack{
    public static void main(String []args){
        stackstr st= new stackstr(5);
        System.out.println("Empty Stack :");
        st.display();
        System.out.println("Size of stack :"+ st.get_size());
        for(int i=1; i<=3; i++)
            st.push(i);
        System.out.println("Full Stack :");
        st.display();
        st.pop();
        st.display();
    }
}

