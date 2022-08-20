package com.bootcoding.basic;

public class calculater {

//    public static void main(String[] args) {
//        System.out.println(calculater(10, 20, "ADD"));
//        System.out.println(calculater(10, 20, "MUL"));
//        System.out.println(calculater(10, 20, "SUB"));
//        System.out.println(calculater(10, 20, "DIV"));



      int calculater(int n, int m, String action) {
        if (action == "ADD") {
            return n + m;

        } else if (action == "MUL") {
            return n * m;

        } else if (action == "SUB") {
            return n - m;

        } else if (action == "DIV") {

            return n / m;
        }
           return n;
    }
}

