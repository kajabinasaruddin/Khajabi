package collections;

import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(10);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        int sum=0;
        for(int i=0;i<l1.size();i++){
            sum+=l1.get(i);
        }
        System.out.println(sum);
        for(int j=sum-1;j>=0;j--){
            System.out.println(l1.get(j));
        }
    }
}
