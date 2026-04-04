// Java code for initializing a Set
import java.util.*;
public class remove_duplicates {
    public static void main(String[] args)
    {
        // creating and initializing an array (of non
        // primitive type)
        Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 };

        // Set demonstration using HashSet Constructor
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        // Duplicate elements are not printed in a set.
        System.out.println(set.size());
    }
}