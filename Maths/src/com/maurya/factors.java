package com.maurya;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        int n = 100;
//        isfactor(n);
//        isfactor1(n);
          isFactor2(n);

    }

    //    //O(N)
//    static void isfactor(int n) {
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//
    //0(sqrt(N))
//    static void isfactor1(int n) {
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                if (n / i == i) {
//                    System.out.print(i + "  ");
//                } else {
//                    System.out.print(i + "  " + n / i + "  ");
//                }
//            }
//        }
//
//    }
//}
//
//           }
//
//        }
//    }
//        //sorted order
//    //both time and sapce is O(sqrt(n))
        static void isFactor2 ( int n ){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (n / i == i) {
                        System.out.print(i + "  ");
                    } else {
                        System.out.print(i + "   ");
                        list.add(n / i);
                    }
                }
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + "   ");
            }


        }
    }

