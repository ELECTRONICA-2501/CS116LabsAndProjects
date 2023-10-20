package CS116Lab5Part2;

import java.util.ArrayList;

public class ArrayListMethodsClient {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dogs");
        list.add("mangos");
        list.add("Squirrel");
        System.out.println("Original list: " + list);
        ArrayListMethods.reverse(list);
        System.out.println("Reversed list: " + list);
        ArrayListMethods.capitalizePlurals(list);
        System.out.println("Capitalized plurals: " + list);
        ArrayListMethods.removePlurals(list);
        System.out.println("Removed plurals: " + list);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //list1.add(1), list1.add(4), list1.add(8), list1.add(9), list1.add(11), list1.add(15), list1.add(17), list1.add(28), list1.add(41), list1.add(59);
        //list2.add(4), list2.add(7), list2.add(11), list2.add(17), list2.add(19), list2.add(20), list2.add(23), list2.add(28), list2.add(37), list2.add(59), list2.add(81);
        //list1.add() = [1,4,8,9,11,15,17,28,41,59];
        //list2 = [4,7,11,17,19,20,23,28,37,59,81];
        list1.add(1);
        list1.add(4);
        list1.add(8);
        list1.add(9);
        list1.add(11);
        list1.add(15);
        list1.add(17);
        list1.add(28);
        list1.add(41);
        list1.add(59);
        //theres got to be a better way to write this
        list2.add(4);
        list2.add(7);
        list2.add(11);
        list2.add(17);
        list2.add(19);
        list2.add(20);
        list2.add(23);
        list2.add(28);
        list2.add(37);
        list2.add(59);
        list2.add(81);

        ArrayList<Integer> intersect = ArrayListMethods.intersect(list1, list2);
        System.out.println("Intersect: " + intersect);
    }
}
