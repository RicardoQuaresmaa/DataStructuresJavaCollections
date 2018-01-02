package Algorithms;

import java.util.Random;
import java.util.Scanner;

public class TimingRandom {

    public static void main(String[] args) {
        new TimingRandom().run();
    }


    public void run() {
        final int SENTINEL = -1;
        final String INPUT_PROMPT = "\nPlease enter the number of" + " integers to be sorted (or " + SENTINEL + " to quit): ";
        final String ANSWER_1 = "The elapsed time was ";
        final double NANO_FACTOR = 1000000000.0; // nanoseconds per second
        final String ANSWER_2 = " seconds.";
        Scanner sc = new Scanner(System.in);
        long elapsedTime;
        while (true) {
            try {
                System.out.print(INPUT_PROMPT);
                int n = sc.nextInt();
                if (n == SENTINEL) break;
                elapsedTime = randomTimer(n);

                System.out.println(ANSWER_1 + (elapsedTime / NANO_FACTOR) + ANSWER_2);
            } catch (Exception e) {
                System.out.println(e);
            }
            sc.nextLine();
        }
    }


    public long randomTimer(int n) {
        Random r = new Random();
        long startTime, finishTime, elapsedTime;
        int[] x = new int[n];
        for (int i = 0; i < n; i++)
            x[i] = r.nextInt();
        startTime = System.nanoTime();
        selectionSort(x);
        finishTime = System.nanoTime();
        elapsedTime = finishTime - startTime;

        return elapsedTime;
    }


    public static void selectionSort(int[] x) {

        for (int i = 0; i < x.length - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < x.length; j++)
                if (x[j] < x[pos]) pos = j;
            int temp = x[i];
            x[i] = x[pos];
            x[pos] = temp;
        }

    }

}