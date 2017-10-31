import java.util.Arrays;

public class BasicJava{
//Print 1-255
    public void printNumbers(int x){        
        for(int i = 1; i <= x; i++){
            System.out.println(i);
        }
    }
//Print odd numbers between 1-255
    public void printOdd(int y){
        for(int i = 1; i <= y; i++){
            if (i % 2 != 0){
            System.out.println(i);
            }
        }
    }
//Print Sum
    public void printSum(int z){
        int sum = 0;
        for(int i = 0; i <= z; i++){
            sum = sum + i;
            System.out.println("New number: " + i +"Sum: " + sum);
        }
    }
// Iterating through an array
    public void printArrayValue(int[] array){
        for(int i = 0; i <= array.length; i++){
            System.out.println(array[i]);
        }        
    }
//Find Max for possitive and negative arrays
    public void findMax(int[] myArray){        
        Arrays.sort(myArray); //Sort the array
        System.out.println(Arrays.toString(myArray)); // print the list
        System.out.println(myArray[(myArray.length-1)]);
    }
// Get Average
    public void getAverage(int[] array){
        int sum = 0;
        int ave = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        ave = sum / array.length;

        System.out.println(ave);
    }
//Array with Odd Numbers
    public void arrayOfOddNum(){        
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 1; i < 255; i = i + 2){
            myArray.add(i);                
        }
        System.out.println(Arrays.toString(array));
    }
//Greater Than Y
    public Integer greaterThanY(int[] array, int y){        
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] > y){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
//Square the values
    public void squareTheValues(double[] myArray){
        int[] newArray;
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = Math.pow(myArray[i], 2);
            
        }
        System.out.println(Arrays.toString(myArray));
    }
//Eliminate Negative Numbers:
    public void eliminateNegativeNum(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            if (myArray[i] < 0){
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
//Max, Min, and Average
    public double[] maxMinAverage(double[] array){        
        Arrays.sort(array);
        double min = array[0];
        double max = array[array.length-1];
        double ave = 0;
        double sum = 0;
        double[] newArray = new double[3];
         for(int i = 0; i < array.length; i++){
            sum += array[i];
            ave = sum / array.length;
        }
        newArray[0] = max;
        newArray[1] = min;
        newArray[2] = ave;
        System.out.println(Arrays.toString(newArray));

        return newArray;
    }
// Shifting the Values in the Array
    public void shiftingValuesOfArray(int[] array){        
        for(int i = 0; i < array.length - 1; i++){            
            array[i] = array[i+1];            
        }
        array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));
    }
}