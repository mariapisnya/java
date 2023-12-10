package cw9;

public class Rose extends Flower {
    protected boolean odour;
    protected float length;
    protected int color;
    Rose() {
        super();
        odour = false;
        length = 0;
    }

    float getLength() {return length;}
}
