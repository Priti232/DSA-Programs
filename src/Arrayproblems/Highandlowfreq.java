package Arrayproblems;

import java.util.HashMap;
import java.util.Map;

import static Arrayproblems.Degreeofarray.degree;

public class Highandlowfreq{
            public static int modOfArray ( int[] arr){
                Map<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < arr.length; i++) {
                    if (map.containsKey(arr[i])) {
                        map.put(arr[i], map.get(arr[i]) + 1);
                    } else {
                        map.put(arr[i], 1);
                    }
                }
                int maxFreqKey = -1;
                int maxFreqValue = -1;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > maxFreqValue) {
                        maxFreqValue = entry.getValue();
                        maxFreqKey = entry.getKey();
                    }
                }
                return maxFreqKey;
            }

            static void main () {
                int[] arr = {1, 3, 2, 1, 4, 6, 4, 12, 3, 7, 2, 8, 3, 9};
                System.out.println(modOfArray(arr));
            }
        }



