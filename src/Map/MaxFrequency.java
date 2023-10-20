/* Question -- Given an array, find the most frequent element in it. If there are multiple elements
 that appear a maximum number of times, print anyone of them.

 N = 6;
 arr[] = {1,3,2,1,4,1}

 Expected output: 1
 */

package Map;
import java.util.*;
public class MaxFrequency {
    public static void main(String[] args) {
        int [] arr = {1,3,2,1,4,1};

        Map<Integer, Integer> freq = new HashMap<>();

        for(int element : arr){
            if (!freq.containsKey(element)){
                freq.put(element,1);
            }
            else {
                freq.put(element, freq.get(element) + 1);
            }
            }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        }
    }

