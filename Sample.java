package kitty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {
    public static Integer findMin(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList.get(0);
    }

    public static Integer findMax(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList.get(sortedList.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(741);
        list.add(852);
        list.add(963);
        list.add(789);
        list.add(456);
        list.add(123);
        System.out.println("Min: " + findMin(list));
        System.out.println("Max: " + findMax(list));
    }
}

