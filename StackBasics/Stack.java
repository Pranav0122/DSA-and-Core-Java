package StackBasics;

public class Stack {
   protected int[] data;
    int tos;
    public Stack(){
        this.data=new int[5];
        this.tos=-1;
    }
    public Stack(int capacity){
        this.data=new int[capacity];
        this.tos=-1;
    }
    public int size(){
        return this.tos + 1;
    }

    public boolean isEmpty(){
        return this.size()==0;
    }

    protected boolean isFull(){
        return this.size()==this.data.length;
    }

    public void push(int value) throws Exception {
        if(isFull()){
            throw new Exception("Full hai bhai");
        }
        this.tos++;
        this.data[tos]=value;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Khaali hai bhai");
        }
        int poppedValue=this.data[tos];
        this.data[tos]=0;
        tos--;
        return poppedValue;
    }

    public int peek(){
        if(isEmpty()){
            System.err.println("Khaali hai bhai");
            return -1;
        }
        return this.data[tos];
    }


    public void display(){
        for (int i=0;i<=this.tos;i++){
            System.out.print(this.data[i]+" ");
        }
        System.out.println();
    }

    public void insert_at_bottom(int val,DynamicStack st) throws Exception {
     if(isEmpty()){
         st.push(val);
     }
     else{
         int a=st.pop();
         insert_at_bottom(val,st);
         st.push(a);
     }
    }
    void reverse(DynamicStack st) throws Exception {
        if(st.size()>0){
            int a=st.pop();
            reverse(st);
            insert_at_bottom(a,st);
        }
    }
//    public static void main(String[] args) {
//        Stack st= new Stack(5);
//        System.out.println(st);
//    }
}
