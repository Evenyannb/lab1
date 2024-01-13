import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P6 {

    public static List<Integer> mergeAndSortLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);
        return mergedList;
    }

    public static void main(String[] args) {
        // Example lists
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(6);
        list2.add(2);

        // Merge the two lists
        List<Integer> mergedList = mergeAndSortLists(list1, list2);

        // Print the merged and sorted list
        System.out.println("Merged and Sorted List: " + mergedList);
    }
}
