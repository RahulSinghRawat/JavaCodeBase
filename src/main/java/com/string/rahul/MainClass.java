package com.string.rahul;

interface Big1{}
interface Small {}
class DemoClass implements Big1 {

}
class DataPoint extends DemoClass implements Small {}
public class MainClass {
    public static void main(String[] args) {
        String s = "xy";
        DemoClass b = new DemoClass();
        DemoClass b2 = new DataPoint();
        DataPoint s2 = new DataPoint();
        if ((b instanceof Big1 ) && (b2 instanceof Small)) {
            s+="yz";
        }
        if((s2 instanceof Big1) && (s2 instanceof Small)) {
            s+="12";
        }
        System.out.println(s);
    }
}
