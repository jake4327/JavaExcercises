package com.qa.day4;


import java.util.ArrayList;
import java.util.Arrays;

public class PeerProgramming {

    public static void main(String[] args) {
        /**System.out.println(reverseFactorial(120));
        System.out.println(reverseFactorial(1));
        System.out.println(reverseFactorial(1 * 2));
        System.out.println(reverseFactorial(1 * 2 * 3 * 4));
        System.out.println(reverseFactorial(1 * 2 * 3 * 4 * 5 * 6));
        printFromOneTwenty();
        doggoCompetition(5);
        System.out.println();
        doggoCompetition(100);
        System.out.println();
        doggoCompetition(1);
        System.out.println();
        doggoCompetition(50);
        **/
        int[] testArrayOne = {5,5,1,6};
        System.out.println(Arrays.toString(whereDoesGoldilocksEat(testArrayOne)));

        System.out.println("===============================================");
        System.out.println("==================TEST_2=======================");

        int[] testArrayTwo = {100, 120,
                297, 90,
                66, 110,
                257, 113,
                276, 191,
                280, 129,
                163, 163,
                193, 193,
                153 , 153,
                107, 107,
                137, 137,
                40, 40,
                127, 127,
                146, 146,
                197, 197,
                59, 59,
                124, 124,
                59, 59,
                54, 54,
                119, 119,
                121 ,121,
                189 ,189,
                108, 108,
                21, 21,
                18, 18,
                90, 90,
                52, 52,
                129, 129,
                181, 181,
                123, 123,
                132, 132};
        System.out.println(Arrays.toString(whereDoesGoldilocksEat(testArrayTwo)));
    }

    public static int reverseFactorial(int num) {
        int divideNumber = 1;
        while (num != 1) {

            //divde by one should be 120 -> 60 -> 20 -> 5 -> 1
            //System.out.println("Divide number: " + num);
            //divide by two
            //divdie by threee
            num = num / divideNumber;
            //System.out.println("Divide number 2: " + num);
            /*
             *  System.out.println("Number: " + num);
             *   System.out.println("Divide number: " + divideNumber);
             *   System.out.println("120 factorial 1: " + num%divideNumber);
             */
            //System.out.println();

            /* if(num % divideNumber!=0){
                System.out.println("This number is not a factorial");
                break;
                } else{
             */
            if (num == 1) {
                break;
            }
            divideNumber++;
        }

        return divideNumber;
    }

    public static void printFromOneTwenty() {
        System.out.println(120 / 5);
        System.out.println((120 / (5)) / 4);

    }

    public static void doggoCompetition(int yourDogsPosition) {
        //ArrayList<Integer> position = new ArrayList<>();
        int lastDigit;
        for (int i = 1; i <= 100; i++) {
            if (i == yourDogsPosition) {
                continue;
            } else {
                //find the last digit in the number i.e 99 -> 9 -> th
                // 92 - > nd
                // to find last digit
                // 92 % 10 = 2
                // i % 10 = last digit
                lastDigit = i % 10;
                if (lastDigit < 4 || (i > 10 && i < 20)) {
                    if ((i > 10 && i < 20)) {
                        System.out.println(i + "th");
                    } else {
                        if (lastDigit == 0) {
                            System.out.println(i + "th");
                        }
                        if (lastDigit == 1) {
                            System.out.println(i + "st");
                        } else if (lastDigit == 2) {
                            System.out.println(i + "nd");
                        } else if (lastDigit == 3) {
                            System.out.println(i + "rd");
                        }
                    }

                } else {
                    System.out.println(i + "th");
                }
                //System.out.println("100th");
            }
        }
    }
    //loop through  0-100 with for loop with array list
    //if(
    //!!!!last th, nd, st, rd !!!!
    //simple for loop -> if(int i is smaller than 3 print i and nd) else if(
    //


//int goldWeight; int maxTempPor; array int[] inputTable; array int[] porridgeTemp; array chairWeight;

    public static int[] whereDoesGoldilocksEat(int[] inputData) {
        //System.out.println(inputData);

        int goldilocksWeight = inputData[0];
        int goldilocksMaxTemp = inputData[1];
        int[] avabliableTables = new int[(inputData.length - 2)/2];
        int indexInAvaliableTables = 0;
        ArrayList<Table> resturant = new ArrayList<>();
        for(int i = 2; i < inputData.length; i+=2){
            resturant.add(new Table(inputData[i], inputData[i+1]));
        }
        /*for(Table t: resturant){
            System.out.println(t.getTemperature() + " " + t.getWeight());
        }*/
        for(int i = 0; i < resturant.size(); i++){
            //Table = {temp, weight}
            //Table = {temp, weight}
            //make an array of tables
            //{table, table, table}
            //System.out.println(inputData[i]);
            //System.out.println(inputData[i+1]);

            //System.out.println("MT: MAX TEMP; MW: MAX WEIGHT");
            System.out.println("Table number: " + (i));
            System.out.println((goldilocksMaxTemp >= resturant.get(i).getTemperature()) && (goldilocksWeight <= resturant.get(i).getWeight()));
            System.out.println("MT: " + goldilocksMaxTemp + " >= " + "Temp: " + resturant.get(i).getTemperature());
            System.out.println("MW: " + goldilocksWeight + " <= " + "Weight: " + resturant.get(i).getWeight());
            System.out.println();

            if((goldilocksWeight <= resturant.get(i).getWeight()) && (goldilocksMaxTemp >= resturant.get(i).getTemperature())){
                avabliableTables[indexInAvaliableTables] = i+1;
                indexInAvaliableTables++;

            }
        }

        System.out.println("avaliable Tables: " + Arrays.toString(avabliableTables));

        int count = 0;

        for(int i: avabliableTables) {
            if (i != 0) {
                count++;
            }
        }

        int[] outputArray = new int[count];
        if (outputArray.length >= 0) System.arraycopy(avabliableTables, 0, outputArray, 0, outputArray.length);

        System.out.println("output Tables: " + Arrays.toString(outputArray));
        return outputArray;

    }
        /*
        int goldilocksMaxWeight = inputData[0][0];
        int goldilocksMaxTemp = inputData[0][1];

        int lenghtOfInputData = inputData[1].length;
        int[][] tablesAvaliable = new int[0][lenghtOfInputData];

        for (int i = 0; i < 2; i++) {
            tablesAvaliable[i] = inputData[i];
            System.out.println(tablesAvaliable[i]);
        }
        System.out.println(tablesAvaliable);

        */

}






