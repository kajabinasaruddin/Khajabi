package Constructors;
import java.util.Date;
public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final Date DateofBirth;
    public ImmutablePerson(String name, int age, Date dateofBirth) {
        this.name = name;
        this.age = age;
        this.DateofBirth = new Date(dateofBirth.getTime());
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Date getDateofBirth() {
        return DateofBirth;
    }

    public static void main(String[] args) {
        Date dob=new Date();
        //ImmutablePerson obj=new ImmutablePerson("alice",dob);
        //System.out.println(obj.name);
      //  System.out.println(obj.age);
       // System.out.println(obj.DateofBirth);

    }
}
