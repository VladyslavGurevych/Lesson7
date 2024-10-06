package app;

import java.util.Random;

public class Lesson6 {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        int sumOfNegNumber = 0;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int maxNumber = myArray[0];
        int minNumber = myArray[0];
        int maxIndex = 0;
        int minIndex = 0;
        double sumOfNumbers = 0;
        int count = 0;
        Random rand = new Random();

        for (int i=0; i < myArray.length; i++){
            myArray[i] = rand.nextInt(201) - 100;
            if (myArray[i] <0 ){
                sumOfNegNumber += myArray[i];
            }
            if (myArray[i] % 2 == 0){
                sumOfEvenNumbers += 1;
            }else {
                sumOfOddNumbers += 1;
            }
        }
        System.out.println("Sum of negative numbers is " + sumOfNegNumber);
        System.out.println("Sum of even numbers is " + sumOfEvenNumbers + ". Sum of odd numbers is " + sumOfOddNumbers);
        for (int i = 0; i < myArray.length-1; i++) {
            if (maxNumber < myArray[i+1]){
                maxNumber = myArray[i+1];
                maxIndex = i+1;
            }else if(myArray[i+1] < minNumber){
                minNumber = myArray[i+1];
                minIndex = i+1;
            }
        }
        System.out.println("The minimum number is " + minNumber + " with index " + minIndex +"\n" +
                "The maximum number is " + maxNumber + " with index " + maxIndex);
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] < 0){
                for (int j = i+1; j < myArray.length; j++) {
                    sumOfNumbers += myArray[j];
                    count += 1;
                }
                break;
            }
        }
        if (sumOfNumbers == 0){
            System.out.println("Mo negative numbers");
        } else {
           System.out.printf("The average number is %.2f", sumOfNumbers/count);
        }


    }
}
