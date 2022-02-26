package StackBasics;

public class DynamicStack extends Stack{
    @Override
    public void push(int value) throws Exception {
        if(isFull()){
            //resizing-increasing the capacity 2 times
            int[] newData=new int[2*this.data.length];//5*2=10;
            for(int i=0;i< data.length;i++)
                newData[i]=this.data[i];//data se newData me copy
            this.data=newData;
        }
        super.push(value);
    }

    public static void main(String[] args) throws Exception {
        DynamicStack ds=new DynamicStack();
        for (int i=1;i<7;i++){
            ds.push(i);
        }
//        ds.insert_at_bottom(7,ds);
        ds.display();
        ds.reverse(ds);
        ds.display();
    }
}
