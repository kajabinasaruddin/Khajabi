package AbstractClass;
public class Arr {
    public static void main(String[] args) {
        int[]arr={9,9,9};
        StringBuffer sb=new StringBuffer("1000");
        int k= sb.length();
        System.out.println(k);
        int arr2[]=new int[k];
        arr2[0]= sb.charAt(0)-'0';
        System.out.println(sb.charAt(0));
        System.out.println(arr2[0]);
    }
}
