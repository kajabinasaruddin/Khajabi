package WorkShop;

import java.util.Arrays;

public class maximunElement {
    //maximum element in array
    public static void main(String[] args) {
        int [] array={1,6,8,9,3,4,6};
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
