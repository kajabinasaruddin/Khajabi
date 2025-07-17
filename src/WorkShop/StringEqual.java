package WorkShop;

public class StringEqual {
    public static void main(String[] args) {
        String name="alice";
        String name1="bob";
        //intern() method is used to create an exact copy of a String that is present
        //in the heap memory and stores it in the String constant pool.
        String l1=name.intern();
        String l2=name1.intern();
        System.out.println(l1==l2);
    }
}
