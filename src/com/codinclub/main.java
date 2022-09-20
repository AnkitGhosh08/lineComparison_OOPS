package com.codinclub;

public class main {

    public static void main(String[] args){
        System.out.println("welcome to Line Comparison Computation Program");

        line l1 = new line();

        l1.p1 = new point();
        l1.p1.x = 1;
        l1.p1.y = 2;

        l1.p2 = new point();
        l1.p2.x = 5;
        l1.p2.y = 7;

        line l2 = new line();

        l2.p3 = new point();
        l2.p3.x = 100;
        l2.p3.y = 200;

        l2.p4 = new point();
        l2.p4.x = 500;
        l2.p4.y = 700;

        float length1 = l1.getLength();
        System.out.println(length1);

        float length2 = l2.length();
        System.out.println(length2);
    }
}