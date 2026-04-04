package com.Subsets;

import java.util.ArrayList;
import java.util.List;

public class Subset_Iteration {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        for (List<Integer> list : ans) {
            System.out.print(list + " ");
        }


    }
    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int j = 0; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(num);
                outer.add(internal);

            }
        }
        return   outer;
    }
}
