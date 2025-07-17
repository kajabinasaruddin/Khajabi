package arrays_Practice_Problems;
public class read_the_number_and_display_the_reverse_order {
    public static void main(String[] args) {
        int[] array=new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
