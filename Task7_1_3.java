package cw7;

/**
 * task 1_3
 * @author Pisnia Mariia
 */

public class Task7_1_3 {
    public int publicField = 1;
    private int privateField = 2;
    protected int protectedField = 3;
    int packagePrivateField = 4;
    public void publicMethod() {
        System.out.println("Загальнодоступний метод.");
    }
    private void privateMethod() {
        System.out.println("Приватний метод.");
    }
    protected void protectedMethod() {
        System.out.println("Захищений метод.");
    }
    void packagePrivateMethod() {
        System.out.println("Метод з доступом до пакету.");
    }
}