package recursion.my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumRecusion {

    public static void main(String[] args) {
        System.out.println("Summa = " + summa(0));
        System.out.println("Summa method 2 = " + summa2(0));
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 15, 6, 10));
        List<Integer> list2 = new ArrayList<>();
        System.out.println("List's summa: " + list + "\nSumma = " + summaList(list));
        System.out.println("List's summa: " + list + "\nSumma = " + summaList2(list));
        System.out.println("Count elements in list - " + countElement(list));
        System.out.println("Count elements in list - " + countElement(list2));

        System.out.println("Max number " + max(list));
    }

    private static int max(List<Integer> list) {
        if (list.size() == 2) {
            return Math.max(list.get(0),list.get(1));
        }
        return Math.max(list.get(0), max(list.subList(1,list.size())));
    }

    private static int countElement(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        return 1 + countElement(list.subList(1, list.size()));
    }

    private static int summaList2(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        } else return list.get(0) + summaList2(list.subList(1, list.size()));
    }

    private static int summaList(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    //without recursion
    private static int summa2(int i) {
        int result = 0;
        for (int i1 = 1; i1 <= i; i1++) {
            result = result + i1;
        }
        return result;
    }

    //with recursion
    private static int summa(int i) {
        int result = 0;
        if (i != 0) {
            result = i + summa(i - 1);
        }
        return result;
    }


}
