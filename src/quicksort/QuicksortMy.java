package quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuicksortMy {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(12, 1, 5, 1, 7, 2, 10));

        System.out.println(quickSort(list));
        System.out.println(quickSortAverage(list));
    }

    private static List<Integer> quickSortAverage(List<Integer> list) {
        List<Integer> sortList = new ArrayList<>();
        if (list.size() < 2) return list;
        else if (list.size() == 2) return List.of(Math.min(list.get(0), list.get(1)),Math.max(list.get(0), list.get(1) ));
        else {
            List<Integer> less = new ArrayList<>();
            List<Integer> more = new ArrayList<>();
            Integer number = list.get(list.size()/2);
            for (int i = 0; i <= list.size()/2; i++) {
                if(list.get(i)<=number) less.add(number);
                else more.add(number);
            }
            for (int i = (list.size()/2)+1; i <= list.size(); i++) {
                if(list.get(i)<=number) less.add(number);
                else more.add(number);
            }

            List<Integer> sortLess = quickSortAverage(less);
            List<Integer> sortMore = quickSortAverage(more);
            sortList.addAll(sortLess);
            sortList.add(number);
            sortList.addAll(sortMore);

            return sortList;
        }
    }

    private static List<Integer> quickSort(List<Integer> list) {
        List<Integer> sortList = new ArrayList<>();
        if (list.size() < 2) return list;
        else {
            Integer number = list.get(0);
            List<Integer> less = list.stream().skip(1).filter(el -> el <= number).collect(Collectors.toList());
            List<Integer> more = list.stream().skip(1).filter(el -> el > number).collect(Collectors.toList());
            List<Integer> sortLess = quickSort(less);
            List<Integer> sortMore = quickSort(more);
            sortList.addAll(sortLess);
            sortList.add(number);
            sortList.addAll(sortMore);

            return sortList;
        }
    }
}
