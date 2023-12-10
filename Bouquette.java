package cw9;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bouquette {
    int size;
    Flower[] flowers;
    String name;
    void addFlower(Flower x){
        flowers[size++] = x;
    }

    boolean removeFlower(Flower x){
        int k= 0;
        for(Flower it: flowers){
            if (it.equals(x)){
                for(int i=k; i<flowers.length; i++){
                    flowers[k] = flowers[k+1];
                }
            }
            k++;
        }
        return false;
    }

    float getPrice(){
        float sum = 0f;
        for(Flower it: flowers){
            sum += it.getPrice();
        }
        return sum;
    }

    float getFresh(){
        int sum =0;
        int num =0;
        LocalDate today = LocalDate.now();
        for(Flower it: flowers){
            if(!(it instanceof Tulip)){
                continue;
            }
            long diff = ChronoUnit.DAYS.between(it.getTime(),today);
            sum += diff;
            num++;
        }
        if (num>0) return (float) sum/num;
        return Float .POSITIVE_INFINITY;
    }

    public String toString(){
        String res = "";
        for(Flower f: flowers){
            res += f.toString();
        }
        return res;
    }

    Tulip getByLength(float a, float b ){
        for(Flower it: flowers){
            if(it instanceof Tulip){
                Tulip z = (Tulip) it;
                if(z.getLength() >= a && z.getLength()<=b){
                    return z;
                }
            }
        }
        return new Tulip();
    }

    public void sort(){
        List <Flower> list = Arrays.asList(flowers);
        Collections.sort(list, null);
        this.flowers = (Flower []) list.toArray();
    }

    public static void main(String[] args){
        Rose rose = new Rose();
        Rose rose1 = new Rose();
        Tulip tulip = new Tulip();
        Bouquette buk = new Bouquette();
        buk.addFlower(rose);
        buk.addFlower(rose1);

        Float p = buk.getPrice();
        System.out.println();
    }
}