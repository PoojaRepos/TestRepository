package program;
import java.util.ArrayList;
import java.util.List;

public class SubsetFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        List<List<Integer>> subsets = findSubsets(arr);

        System.out.println("Subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> findSubsets(int[] arr) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // Adding an empty set

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];
            int n = subsets.size();

            for (int j = 0; j < n; j++) {
                List<Integer> subset = new ArrayList<>(subsets.get(j));
                subset.add(currentNum);
                subsets.add(subset);
            }
        }

        return subsets;
    }
}
