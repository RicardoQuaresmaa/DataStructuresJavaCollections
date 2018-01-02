package Polymorphism;

import java.util.Scanner;

public class Polymorphism
{

        public static void main (String args []) {
    new Polymorphism().run();
}


        public void run() {
    Scanner sc = new Scanner (System.in);

            A a;

            int code = sc.nextInt();

            if (code == 0)
            {
                a=new A();
            }

            else
            {
                a = new D();
            }
            System.out.println (a);
}



    class A {
        public String toString () {
            return "A";
        }
    }



    class D extends A {
            public String toString () {
                return "D";
            }
    }






}


