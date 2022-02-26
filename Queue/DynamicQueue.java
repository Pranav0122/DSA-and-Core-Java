package Queue;

public class DynamicQueue extends QueueUsingArrays{
    @Override
    public void enQueue(int value) throws Exception {
        if(this.size==data.length){
            int newDta[]=new int[2*data.length];
            for(int i=0;i<data.length;i++){
                int idx=front+i;
                idx=idx%data.length;
                newDta[i]=data[idx];
            }
            data=newDta;
            front=0;
        }
        super.enQueue(value);
    }
}
