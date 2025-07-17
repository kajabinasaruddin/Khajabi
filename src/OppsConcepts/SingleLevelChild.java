package OppsConcepts;

public class SingleLevelChild extends SingleLevelParent{
    int a=10;
    int b=20;

    public static void main(String[] args) {
        SingleLevelChild obj=new SingleLevelChild();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
