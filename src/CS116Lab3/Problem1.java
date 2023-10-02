package CS116Lab3;

public class Problem1 {
    public static void main(String[] args) {
        int[] val = {12, -4, 82, 17};
       // int[] twice;

        int[] twice = new int[val.length];

        //Original Array
        for(int i=0; i<val.length; i++){
            System.out.println("val :" + val[i]);
        }

        //twice
        for(int i=0; i < val.length; i++){
            twice[i] = val[i]*2;
            System.out.println("val2: " + val[i]);
        }

        //new array
        for (int i = 0; i < twice.length; i++){
            System.out.println("ahaha: "+twice[i]);
        }
    }
}
