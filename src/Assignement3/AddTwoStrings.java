package Assignement3;
public class AddTwoStrings {
    // write a mehtod to add 2 stirng type values - concatination
    public static String add(String name,String name1){
        return name+name1;
    }
    public static void main(String[] args) {
        AddTwoStrings obj1=new AddTwoStrings();
        System.out.println(obj1.add("khajabi" , "shaik"));
    }
}
