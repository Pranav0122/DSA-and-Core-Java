package Queue;

public class QueueUsingArrays {
    int data[];
    int front;
    int size;
    public QueueUsingArrays(){
        this.data=new int[5];
        this.front=0;
        this.size=0;
    }
    public QueueUsingArrays(int capacity){
        this.data=new int[capacity];
        this.front=0;
        this.size=0;
    }
    public void  enQueue(int value) throws Exception {
        if(size==data.length){
           throw  new Exception("Queue Full hai");
        }
        int idx=front+size;
        idx=idx%data.length;
        data[idx]=value;
        size++;
    }
    public int deQueue() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Queue khalli hai");
        }
        int value=data[front];
        data[front]=0;
        front++;
        size--;
        front=front%data.length;
        return value;
    }
    public Boolean isEmpty(){
        return this.size==0;
    }
    public int getFront() throws Exception {
        if(this.isEmpty())
            throw new Exception("Queue khalli hai");
        return data[front];
    }

    public void display(){
        for(int i=0;i<data.length;i++){
            int idx=this.front+i;
            idx=idx%data.length;
            System.out.print(data[idx]+" ");
        }
        System.out.println();
    }
}
