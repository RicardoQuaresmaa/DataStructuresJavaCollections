package Interface;

public interface Figure {

    final static int MAX_X_COORD = 1024;
    final static int MAX_Y_COORD = 768;

    void draw(int x, int y);
    void move (int x, int y);

}
