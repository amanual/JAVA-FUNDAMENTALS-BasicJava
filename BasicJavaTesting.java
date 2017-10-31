public class BasicJavaTesting{
    public static void main(String[] args){
        int[] array = {1,3,5,-22,7,9,-13};
        double[] array2 = {1,3,5,22,7,9,13};
        int[] array3 = {-1,-3,-5,-22,-7,-9,-13};
        BasicJava basics = new BasicJava();
        basics.printNumbers(255);        
        basics.printOdd(255);
        basics.printSum(255);
        basics.printArrayValue(array);
        basics.findMax(array2);
        basics.getAverage(array);
        basics.arrayOfOddNum();
        basics.greaterThanY(array, 3);
        basics.squareTheValues(array2);
        basics.eliminateNegativeNum(array);
        basics.maxMinAverage(array2);
        basics.shiftingValuesOfArray(array);

        


    }
}