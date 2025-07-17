package Singleton_Practice;
public class SingletonExample {
    public String animal(){
        return "This is puppy";
    }
    public static class SingletonExample1 {
        private static SingletonExample se = null;

        private SingletonExample1() {
        }
        public static SingletonExample getInstance() {
            if (se == null) {
                se = new SingletonExample();
            }
            return se;
        }
    }
        public static void main(String[] args) {
            SingletonExample s = SingletonExample1.getInstance();
            System.out.println("Hashcode::" + s.hashCode());
            System.out.println("Method::" + s.animal());
        }
}