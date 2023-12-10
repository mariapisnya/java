package cw9;

public class Tulip extends Flower {
    protected boolean odour;
    protected float length;
    protected int color;
    Tulip() {
        super();
        odour = false;
        length = 0;
    }

    float getLength() {return length;}
}
