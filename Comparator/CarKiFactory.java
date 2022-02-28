package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CarKiFactory {
    private static void bubbleSort(Car[] arr, Comparator<Car> comp){
        int n=arr.length;
//        System.out.println(arr);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
//                if(arr[j]-arr[j+1]>0){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
                if(comp.compare(arr[j],arr[j+1])>0){
                    Car temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Car[] cars=new Car[3];
        Car c1=new Car("maruti 800",100,10000);
        Car c2=new Car("Aston Martin",250,10000000);
        Car c3=new Car("Ferrari",300,5000000);

        cars[0]=c1;
        cars[1]=c2;
        cars[2]=c3;
        System.out.println(Arrays.toString(cars));
//        bubbleSort(cars,new CarPriceComparator());
        Arrays.sort(cars, new Comparator<Car>() {
            //Ascending order > 0, descending order < 0
            //Compare > 0 swap, < 0 no swap
            @Override
            public int compare(Car o1, Car o2) {
                int val=o1.cost-o2.cost;
                if(val<=0)
                    return 1;
                    else
                        return -1;
            }
        });
        System.out.println(Arrays.toString(cars));
    }
}
