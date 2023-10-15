package ChavaPractice;

public class supMane {
    public static void main(String[] args) {
        ArrayClass defaultArray = new ArrayClass();
        int[] defaultData = defaultArray.getDataArray();
        System.out.println("Default Array: " + ArrayClass.toString(defaultData));

        int[] initialData = {1, 2, 3, 4, 5};
        ArrayClass customArray = new ArrayClass(initialData);
        int[] customData = customArray.getDataArray();
        System.out.println("Custom Array: " + ArrayClass.toString(customData));

        //modify the array using the setter method
        int[] newData = {6, 7, 8, 9, 10};
        customArray.setDataArray(newData);
        System.out.println("Modified Array: " + ArrayClass.toString(customArray.getDataArray()));
    }
}
