package Constructors;
public class FaangDetails {
   public  int year;
   public String location;

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    FaangDetails(int year,String location){
        this.year=year;
        this.location=location;
    }


    public static void main(String[] args) {
        FaangDetails obj=new FaangDetails(2022,"hyd");
        System.out.println(obj.getYear());
        System.out.println(obj.getLocation());
    }
}
