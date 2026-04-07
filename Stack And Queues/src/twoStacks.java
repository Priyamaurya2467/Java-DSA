package com.maurya;

import java.util.Arrays;

public class twoStacks {
    static int twoStacks(int x , int[] a, int [] b){
        return twoStacks(x,a,b,0,0)-1;
    }

    private static int twoStacks(int x , int[] a , int[] b , int sum , int count){
        if(sum>x)
        {
            return count;
        }
        int ans1 = twoStacks(x, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],)
    }

}
