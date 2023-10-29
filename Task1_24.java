package cw_hw5;

/**
 * task 1.24
 * @author Mariia Pisnia
 */

public class Task1_24 {
    int maxWeight = 0;
    int W = 12;
    int n = 5;
    int[] a = {1, 2, 3, 4, 5};
    public int maxWeight(int weight, int score, int num) {
        if (weight == this.W || num >= this.n) {
            if (score > this.maxWeight && score <= this.W)
                this.maxWeight = score;
            return 0;
        }

        this.maxWeight(weight, score, num + 1);
        this.maxWeight(weight + 1, score + this.a[num], num + 1);
        return 0;
    }

    public void run() {
        this.maxWeight(0, 0, 0);
        System.out.println(maxWeight);

    }
    public static void main(String[] args)
    {
        Task1_24 p = new Task1_24();
        p.run();
    }
}
