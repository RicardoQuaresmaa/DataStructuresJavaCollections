package Immutable;

public class Immutable {
    public static void main (String[ ] args) {
        new Immutable().run();
    }

    public void run() {
    String s = "yes";
    flip (s);
    System.out.println (s);
}

    public void flip (String t) {
    t=new String ("no");
}
}
