package com.codinclub;

public class line {
    static point p1;
    static point p2;
    static point p3;
    static point p4;
    float getLength() {
        return (float) Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }
    float length() {
        return (float) Math.sqrt(Math.pow((p3.x - p4.x), 2) + Math.pow((p3.y - p4.y), 2));
    }
        static void checkEqual(float length1,float length2){
            if(length1 == length2 ){
                System.out.println("Both the lines are equal");
            }else
                System.out.println("Both the lines are not equal");
        }
}