package Algorithms;

public class Run2 {


    public static void main(String[] args) {
        double[] doble={45.0f,56.0f};

        System.out.println(aboveMeanCount(doble,45));
    }

    public static int aboveMeanCount (double[] a,double mean)
    {
        int n = a.length, count = 0;
        for (int i = 0; i < n; i++)
            if (a [i] > mean)
                count++;
        return count;
    }




}
