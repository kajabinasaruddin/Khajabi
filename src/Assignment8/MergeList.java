package Assignment8;
import java.util.ArrayList;
public class MergeList {
    public static void main(String[] args) {
        //Given two lists of integers, merge them into a single list without duplicates.
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<String>uniqueList=new ArrayList<>();
        arr.add("alice");
        arr.add("bob");
        arr.add("alice");
        arr.add("charlie");
        for(String temp:arr){
            if(!uniqueList.contains(temp)){
                uniqueList.add(temp);}}
        System.out.println(uniqueList);
        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<String>uniqueList1=new ArrayList<>();
        arr1.add("bhanu");
        arr1.add("asha");
        arr1.add("bhanu");
        arr1.add("kali");
        for(String temp:arr1){
            if(!uniqueList1.contains(temp)){
                uniqueList1.add(temp);}}
        System.out.println(uniqueList1);
        uniqueList.addAll(uniqueList1);
        System.out.println(uniqueList);}}
