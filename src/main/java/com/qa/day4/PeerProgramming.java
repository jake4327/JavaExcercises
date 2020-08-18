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

        System.out.println("===============================================");
        System.out.println("==================TEST_1=======================");

        int[] testArrayOne = {5,5,6,4};
        System.out.println(Arrays.toString(whereDoesGoldilocksEat(testArrayOne,false)));

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
        System.out.println(Arrays.toString(whereDoesGoldilocksEat(testArrayTwo,false)));
        //outputThreeArrays();

        System.out.println("===============================================");
        System.out.println("==================TEST_3=======================");

        int[] testArrayThree = {100, 120, 297, 90, 54, 66, 110, 78, 257, 113, 98, 276, 191, 12, 280, 129, 22, 163, 163, 12, 193,
                193, 45, 153, 153, 65, 107, 107, 71, 137, 137, 87, 40, 40, 98, 127, 127, 45, 146, 146, 98, 197, 197, 10,
                59, 59, 100, 124, 124, 12, 59, 59, 54, 54, 54, 98, 119, 119, 87, 121, 121, 32, 189, 189, 65, 108, 108,
                97, 21, 21, 64, 18, 18, 31, 90, 90, 54, 52, 52, 65, 129, 129, 87, 181, 181, 98, 123, 123, 65, 132, 132, 21};
        System.out.println(Arrays.toString(whereDoesGoldilocksEat(testArrayThree,true)));

        System.out.println("===============================================");
        System.out.println("==================Daood_Test=======================");
        int[] testArrayFour = {100, 120};
        goldilocks(testArrayFour);
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

    public static int[] whereDoesGoldilocksEat(int[] inputData, boolean isLuminosityAFactor) {
        //System.out.println(inputData);
        final int GOLDILOCKSMAXLUMINOSITY = 70;
        int goldilocksWeight = inputData[0];
        int goldilocksMaxTemp = inputData[1];
        // [ GW, GT, T1_Weight, ... , TN_Weight]
        int[] avabliableTables = new int[(inputData.length - 2)/2];
        int indexInAvaliableTables = 0;
        ArrayList<Table> resturant = new ArrayList<>();


        if(isLuminosityAFactor){
            for (int i = 2; i < inputData.length; i += 3) {
                //System.out.println(inputData[i]+ " "+ inputData[i + 1]+" " + inputData[i+2]);
                resturant.add(new Table(inputData[i], inputData[i + 1], inputData[i+2]));
            }
        }else {
            for (int i = 2; i < inputData.length; i += 2) {
                //System.out.println(inputData[i] +" "+ inputData[i + 1]);
                resturant.add(new Table(inputData[i], inputData[i + 1]));
            }
        }
        /*
        for(Table t: resturant){
            System.out.println(t.getTemperature() + " " + t.getWeight());
            System.out.println(t.getTemperature());
        }
         */

        for(int i = 0; i < resturant.size(); i++){
            //System.out.println("MT: MAX TEMP; MW: MAX WEIGHT");
            //System.out.println();
            /*    System.out.println("Table number: " + (i));
                System.out.println((goldilocksMaxTemp >= resturant.get(i).getTemperature()) && (goldilocksWeight <= resturant.get(i).getWeight()));
                System.out.println("MW: " + goldilocksWeight + " <= " + "Weight: " + resturant.get(i).getWeight());
                System.out.println("MT: " + goldilocksMaxTemp + " >= " + "Temp: " + resturant.get(i).getTemperature());
            */
            if(isLuminosityAFactor){
                /*System.out.println(GOLDILOCKSMAXLUMINOSITY +"<="+ resturant.get(i).getLuminosity());
                System.out.println(GOLDILOCKSMAXLUMINOSITY <= resturant.get(i).getLuminosity());
                */
                if ((goldilocksWeight <= resturant.get(i).getWeight()) &&
                        (goldilocksMaxTemp >= resturant.get(i).getTemperature()) &&
                        (GOLDILOCKSMAXLUMINOSITY <= resturant.get(i).getLuminosity())) {
                    avabliableTables[indexInAvaliableTables] = i+1;
                    indexInAvaliableTables++;
                }
            }else {
                //System.out.println((goldilocksWeight <= resturant.get(i).getWeight()) && (goldilocksMaxTemp >= resturant.get(i).getTemperature()));
                if ((goldilocksWeight <= resturant.get(i).getWeight()) &&
                        (goldilocksMaxTemp >= resturant.get(i).getTemperature())) {
                    //System.out.println(i);
                    avabliableTables[indexInAvaliableTables] = i+1;
                    indexInAvaliableTables++;
                }
            }
        }

        //System.out.println("avaliable Tables: " + Arrays.toString(avabliableTables));

        int count = 0;

        for(int i: avabliableTables) {
            if (i != 0) {
                count++;
            }
        }

        int[] outputArray = new int[count];
        if (outputArray.length >= 0) System.arraycopy(avabliableTables, 0, outputArray, 0, outputArray.length);
        return outputArray;
    }

    public static void outputThreeArrays(){
        int[] maxWeightTable = {90, 110, 113, 191, 129, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
        int[] tempTable =      {297, 66, 257, 276, 280, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
        int[] luminosityTable ={54, 78, 98, 12, 22, 12, 45, 65, 71, 87, 98, 45, 98, 10, 100, 12, 54, 98, 87, 32, 65, 97, 64, 31, 54, 65, 87, 98, 65, 21};
        ArrayList<Integer> vars = new ArrayList<>();
        //System.out.println(maxWeightTable.length + " " + tempTable.length + " " + luminosityTable.length);
        for(int i =0; i < maxWeightTable.length; i++){
            vars.add(tempTable[i]);
            vars.add(maxWeightTable[i]);
            vars.add(luminosityTable[i]);
        }
        //System.out.println(vars);
        int count = 1;
        for(int i: maxWeightTable){
            System.out.println("Table_" + count + " Weight: " + i +"kg" );
            count++;
        }
    }

    public static void goldilocks(int[] goldilocks){
        // goldilocks 0 = weight
        // goldilocks 1 = Max TEmp
        final int MAXWEIGHT = goldilocks[0];
        final int MAXTEMP = goldilocks[1];
        final int MAXLUMINOSITY = 70;
        // Multi dimensional array for the weight of goldilocks and temp of porridge
        int[] weightTable = {297, 66, 257, 276, 280, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
        int[] tempTable = {90, 110, 113, 191, 129, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
        int[] luminosityTable = {54, 78, 98, 12, 22, 12, 45, 65, 71, 87, 98, 45, 98, 10, 100, 12, 54, 98, 87, 32, 65, 97, 64, 31, 54, 65, 87, 98, 65, 21};

        int tableNumber = 1;
        int[] avlTables = new int[0];
        //plan
        for(int i = 0; i < weightTable.length; i++){
            //System.out.println();
            //System.out.println("Weight table" +tableNumber+" can hold: " + weightTable[i] +"kg");
            if(MAXWEIGHT <= weightTable[i]){
                //System.out.println("table" + tableNumber + " can hold Goldie: " + weightTable[i]+"kg");
                //System.out.println("Pouridge is: " + tempTable[i]+"oC");
                if(MAXTEMP >= tempTable[i]){
                    //System.out.println("Goldie can eat at temp: " + tempTable[i]+"oC");
                    //if(luminosityTable[i] >= MAXLUMINOSITY) {
                        avlTables = new int[avlTables.length + 1];
                        System.out.println("Correct seat is : " + tableNumber);
                    //}
                }
            }
            tableNumber++;
        }
        System.out.println("Number of available seats : " + Arrays.toString(avlTables));
    }


}






