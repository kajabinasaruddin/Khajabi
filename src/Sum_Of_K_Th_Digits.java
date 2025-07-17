public class Sum_Of_K_Th_Digits {
    public static void main(String[] args) {
        String s="111112222213";
        int k=3;
        int sum=0;

        for(int i=0;i<s.length();i+=k){
            System.out.println(s.charAt(i));
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
