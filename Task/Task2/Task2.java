package org.example;

public class Task2 {

        public static void main(String[] args) {
            int a = 1;
            int b = 2;


            int c = 3;
            int d = 4;
            System.out.println("Значения переменных до:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            swap1(a, b);




            //вариант решения 2
            System.out.println("Значения переменных до:");
            System.out.println("c = " + c);
            System.out.println("d = " + d);

            swap2(c, d);


        }

        public static void swap1(int a, int b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            System.out.println("Значения переменных после(вариант 1):");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        public static void swap2(int c, int d) {
        c = c + d;
        d = c - d;
        c = c - d;
            System.out.println("Значения переменных после(вариант 2):");
            System.out.println("c = " + c);
            System.out.println("d = " + d);
    }

}
