package CS116Lab5Part2;
import java.util.ArrayList;
import java.util.List;
public class ArrayListMethods {
    public static void reverse(ArrayList<String> list){
        for (int i = 0; i < list.size()/2; i++){
            String temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }
    }
    public static void capitalizePlurals(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).endsWith("s")){
                list.set(i, list.get(i).toUpperCase());
            }
        }
    }
    public static void removePlurals(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).endsWith("s")){
                list.remove(i);
                i--;
            }
        }
    }
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<>();
        int i = 0, j =0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                i++;
            } else if (list1.get(i) > list2.get(j)) {
                j++;
            } else {
                list3.add(list1.get(i));
                i++;
                j++;
            }
        }
           return list3;
    }
}
