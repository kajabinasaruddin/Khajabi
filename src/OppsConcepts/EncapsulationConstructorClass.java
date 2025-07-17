package OppsConcepts;

import com.sun.security.jgss.GSSUtil;

public class EncapsulationConstructorClass {
    public static void main(String[] args) {
        EncapsulationConstructor obj=new EncapsulationConstructor();
        obj.setYear(2004);
        obj.setAge(12);
        obj.setName("alice");
        System.out.println(obj.getYear());
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
}
