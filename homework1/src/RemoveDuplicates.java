import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] numbers = {7, 10, 11, 15, 2, 3, 3, 10, 11, 20};
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.print(Arrays.toString(numbers) + "\n");

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(numbers));
        Integer[] withoutDuplicates = linkedHashSet.toArray(new Integer[] {});

        System.out.println(Arrays.toString(withoutDuplicates));
    }
}
