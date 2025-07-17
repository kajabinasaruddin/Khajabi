package AbstractClass;
public class Abstract2 extends Abstract1 {
    @Override
    int name() {
        return 10;
    }
    public static void main(String[] args) {
        Abstract2 obj = new Abstract2();
        System.out.println(obj.add(5,8));
        System.out.println(obj.name());
    }
}