package StackQuestions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PlayingCardsBetterSpace {
    static final int MAX = 1300000;
    static boolean[] sieve = new boolean[MAX];
    static ArrayList<Integer> primes = new ArrayList<>();

    static void createSieve() {
        for (int i = 0; i < MAX; i++) {
            sieve[i] = true;
        }
        sieve[0] = sieve[1] = false;
        for (int i = 2; i < MAX; i++) {
            if (sieve[i]) {
                primes.add(i);
                for (int j = i * i; j < MAX && j >= 0; j += i) {
                    sieve[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        primes.add(-1);
        createSieve();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        Stack<Integer> a0=new Stack<>();
        while (n-->0)
            a0.push(sc.nextInt());
        Stack<Integer> a=new Stack<>();
        Stack<Integer> b=new Stack<>();
        for (int i=1;i<=q;i++){
            while (!a0.isEmpty()){
                int topElement=a0.pop();
                int ithPrime=primes.get(i);
                if(topElement%ithPrime==0)
                    b.push(topElement);
                else
                    a.push(topElement);
            }
            while (!b.isEmpty())
                System.out.println(b.pop());
            a0=a;
            a=new Stack<>();
        }
        while (!a0.isEmpty())
            System.out.println(a0.pop());
    }
}
