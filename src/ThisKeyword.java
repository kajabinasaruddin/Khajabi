public class ThisKeyword {
     int a;
     int b;
    public ThisKeyword(int a,int b){
        this.a=a;
        this.b=b;
    }

    public static void main(Project5[] args) {
        ThisKeyword obj=new ThisKeyword(2,3);
        System.out.println(obj.a+ obj.b);
    }
}
