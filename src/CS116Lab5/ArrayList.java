package CS116Lab5;
import java.util.ArrayList;
public class ArrayList{
   public void reverse(ArrayList<String> list) {
       int left =0;
       //leftmost index
       int right = list.size()-1;
       //rightmost index

       while(left < right){
           //swap the elements at the left and right indices
           String temp = list.get(left);
           list.set(left, list.get(right));
           list.set(right, temp);
           //increment left and decrement right
           left++;
           right--;
       }
   }
   public static void capilatizePlurals(ArrayList<String> list) {
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i).endsWith("s")) {
               list.set(i, list.get(i).toUpperCase());
           }
       }
   }
   public static void removePlurals(ArrayList<String> list) {
       for (int i = list.size() - 1; i >= 0; i--) {
           if (list.get(i).endsWith("s")) {
               list.remove(i);
           }
       }
   }



    private void remove(int i) {

    }

    private int size() {
        return 0;
    }


    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
       ArrayList<Integer> result = new ArrayList<Integer>();
       int i = 0;
       int j = 0;

         while (i < list1.size() && j < list2.size()) {
              if (list1.get(i) < list2.get(j)) {
                i++;
              } else if (list1.get(i) > list2.get(j)) {
                j++;
              } else {
                result.add(list1.get(i));
                i++;
                j++;
              }
         }
            return result;
   }



       //reverse the order of the elements in the list
   }


