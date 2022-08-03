package sort.selection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortVyborom {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 6, 5, 3, 15));
        System.out.println(sortList(list));
    }

    private static List<Integer> sortList(List<Integer> list) {
        List<Integer> listNew = new ArrayList<>();
        while (list.size() > 0) {
            Integer smallest = findMinElement(list);
            listNew.add(smallest);
            list.remove(smallest);
        }
        ;
        return listNew;
    }

    private static Integer findMinElement(List<Integer> list) {
        Integer element = list.get(0);
        Integer number = 0;
        for (int i = 0; i < list.size()-1; i++) {
            if(element>list.get(i)){
                element = list.get(i);
            }
        }
        return element;

    }
}
