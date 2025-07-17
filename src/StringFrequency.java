import java.util.Map;
import java.util.*;

public class StringFrequency {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Map<Integer,Integer> freq=new TreeMap<>();
        for(int i:a){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(Map.Entry <Integer,Integer> entry:freq.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

//            if(entry.getValue()==1){
//                System.out.println(entry.getKey());
          //  }
        }
    }
}