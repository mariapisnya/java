package cw7;

/**
 * task 1_4
 * @author Pisnia Mariia
 */

public class Task7_1_4 {
    protected int data;
    public void setData(int value) {
        this.data = value;
    }
    public int getData() {
        return this.data;
    }
}
class Main {
    public static void main(String[] args) {
        Task7_1_4 obj = new Task7_1_4();
        obj.setData(42);
        System.out.println("Значення поля: " + obj.getData());
    }
}
