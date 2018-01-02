package Declaration;

import java.util.ArrayList;

public class Runnable {

    ArrayList<Double> gpaList;

    public static void main(String[] args) {

        Object asd = new Runnable().gpaList = new ArrayList<Double>(5);

        ((ArrayList) asd).add(new Double(2.7));

        System.out.println(((ArrayList) asd).size());

        System.out.println(((ArrayList) asd).get(0));


        ArrayList<FullTimeEmployee> employeeList = new ArrayList<FullTimeEmployee>(3);


        FullTimeEmployee e1=new FullTimeEmployee();

        e1.yas=56;
        e1.kullaniciadi="bny";

         employeeList.add(e1);

        System.out.println(employeeList.get(0).kullaniciadi);


    }
}
     class FullTimeEmployee
    {
        int yas;
        String kullaniciadi;

        private void getFullTimeEmployee(int yas,String kullaniciadi)
        {
           yas=yas;
           kullaniciadi=kullaniciadi;
        }


    }


