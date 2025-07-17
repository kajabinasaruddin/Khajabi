package OppsConcepts;
public class EncapsulationExample {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EncapsulationExample(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args) {
        EncapsulationExample obj=new EncapsulationExample(12,"alice");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        obj.setAge(13);
        obj.setName("bob");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
