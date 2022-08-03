package binary.search;

public class BynarySearchMy {

    public static void main(String[] args) {
        int[] myList = {21, 45, 87, 93, 109};
        int[] myList1 = {};

        System.out.println(searchNumberPozishion(myList1, 21));
        System.out.println(searchNumberPozishion(myList, 21));
        System.out.println(searchNumberPozishion(myList, 87));
        System.out.println(searchNumberPozishion(myList, 45));
        System.out.println(searchNumberPozishion(myList, 93));
        System.out.println("109 "+searchNumberPozishion(myList, 109));
    }

    private static Integer searchNumberPozishion(int[] myList, int item) {

        if (myList.length == 0) {
            System.out.println("myList is Empty");
            return null;
        }

        int start = 0;
        int end = myList.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int number = myList[mid];
            if (number == item) {
                System.out.println("ITEM = " + item);
                System.out.println("We searched number = " + number);
                System.out.println("Position number = " + mid);
                return mid;
            } else if (number < item) {
                start = mid + 1 ;
            } else if (number > item) {
                end = mid - 1;
            }
        }
        return null;
    }
}
