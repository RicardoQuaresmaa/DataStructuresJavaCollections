package Algorithms;

public class Run1 {

    public static int aboveMeanCount (double[] a,double mean)
    {
        int n = a.length, count = 0;

        for (int i = 0; i < n; i++)
        {
            if (a[i] > mean)
            {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {

        double[] asd={3453,54353};
        Run1.aboveMeanCount(asd,43);

    }

}
