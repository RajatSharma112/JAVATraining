package javaActivity2;

import java.util.*;

public class activity2 {

	public static void main(String[] args) {
    int[] tensCheck= {10, 77, 10, 54, -11, 10};
    System.out.println("Cuurent Array:" + Arrays.toString(tensCheck));

	int Tennumber= 10;
	int sumNumber= 30;
	System.out.println("Result: " + result(tensCheck, Tennumber, sumNumber));
	}
	public static boolean result(int[] numbers, int Tennumber, int sumNumber) {
        int temproray_sum = 0;
        for (int number : numbers) {
            if (number == Tennumber) {
            	temproray_sum += sumNumber;
            }

            if (temproray_sum > sumNumber) {
                break;
            }
        }
        return temproray_sum == sumNumber;
    }

}
