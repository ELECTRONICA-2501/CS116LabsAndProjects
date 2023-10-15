package ChavaPractice;

public class ArrayClass {
    private int[] dataArray;

    public ArrayClass(){

        dataArray = new int[0];
        //initialize with empty arrays
    }
    public ArrayClass(int[] initialData){
        //constructor
        dataArray = new int[initialData.length];
        //initialize with initialData

        for(int i = 0; i < initialData.length; i++)
        //loop through initialData
        {
            dataArray[i] = initialData[i];
            //set dataArray to initialData
        }
    }

    //getter method to retrieve a copy of the Array
    public int[] getDataArray(){
        int[] copy = new int[dataArray.length];
        //create copy of dataArray
        for(int i = 0; i < dataArray.length; i++)

        {
            copy[i] = dataArray[i];
            //loop through dataArray and set copy to dataArray
        }
        return copy;
        //return copy
    }
    //setter method to set the Array
    public void setDataArray(int[] newDataArray){
        dataArray = new int[newDataArray.length];
        for(int i = 0; i < newDataArray.length; i++)
        {
            dataArray[i] = newDataArray[i];
        }
    }
    //toString method to return a String representation of the Array
    public static String toString(int[] dataArray){
        String result = "";
        for(int i = 0; i < dataArray.length; i++)
        {
            result += dataArray[i] + " ";
        }
        return result;
    }
}
