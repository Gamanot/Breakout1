import acm.graphics.GRect;
import java.awt.Color;
public class Brick extends GRect {

    public static final int WIDTH = 44;
    public static final int HEIGHT = 20;

    public boolean power = false;
    public boolean anotherOne = false;

    public Brick(double x, double y, Color color, int row, boolean power, boolean anotherOne){
        super(x,y,WIDTH,HEIGHT);
        this.setFillColor(color);
        this.setFilled(true);
        this.power = power;
        this.anotherOne = anotherOne;
    }


}

