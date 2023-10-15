package cw_hw4;

import java.time.LocalDate;
import java.util.*;

/**
 * task 4.2
 * @author Mariia Pisnia
 */

public class Task4_2 {
    public static void main(String args[]) {
        LocalDate date = LocalDate.of(2023, 10, 13); // last friday 13'th
        date = date.plusDays(1);

        int count = 0;
        List<Integer> prev = new ArrayList<Integer>();
        for (int i = 0; i < 146100; i++) {
            String s = date.getDayOfWeek().toString();
            int d = date.getDayOfMonth();


            if (s == "FRIDAY" & d == 13) {
                prev.add(count);
                count = 0;
            }

            count += 1;
            date = date.plusDays(1);
        }
        Collections.sort(prev);
        Collections.reverse(prev);
        System.out.println("Days between fridays 13's is " + (prev.get(0) - 1));

    }
}
