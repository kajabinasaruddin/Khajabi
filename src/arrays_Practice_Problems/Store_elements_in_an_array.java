package arrays_Practice_Problems;
public class Store_elements_in_an_array {
    public static void main(String[] args) {
        int[] array=new int[5];
        array[0]=5;
        array[1]=11;
        array[2]=22;
        array[3]=33;
        array[4]=44;
        System.out.println(array);
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
