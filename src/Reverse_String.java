public class Reverse_String {
    public static void main(String[] args) {
        String[] s ={"h","e","l","l","o"};
        int left=0;
        int right=s.length-1;
        while(left<right){
            String temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        for(String c:s){
            System.out.println(c);
        }
    }
}
