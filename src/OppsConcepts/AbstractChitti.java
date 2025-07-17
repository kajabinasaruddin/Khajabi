package OppsConcepts;

public class AbstractChitti extends AbstractSana{
    public static void main(String[] args) {
        AbstractChitti obj=new AbstractChitti() ;// Upcasting
        obj.nmethd();  // Calls normal method
        obj.abmethod();
    }
}
