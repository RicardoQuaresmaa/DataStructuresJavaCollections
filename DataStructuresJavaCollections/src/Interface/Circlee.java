package Interface;

public class Circlee implements Figure {

     int xCoord, yCoord, radius;

    @Override
    public void draw (int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("bny");
    }
}
