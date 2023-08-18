package chapter13;

import java.io.IOException;

public class DividingByZero {

    public static void main(String[] args) {
        divideByZero();
    }
    public static void divideByZero(){
        try {
            int c=30/0;
        }catch (ArithmeticException e){
            System.out.println("Division by 0 is not allowed");
            e.printStackTrace();
        }finally {
            System.out.println("Divison is fun");
        }

    }

}