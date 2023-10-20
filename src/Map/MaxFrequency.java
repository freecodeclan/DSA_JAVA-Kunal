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

        for(int element : arr){                 //-- 'element' stand for element inside an array
            if (!freq.containsKey(element)){    //-- Checking whether an element is present or not inside an array
                freq.put(element,1);            //-- Initialize its frequency to 1
            }
            else {
                //-- Element is already in the map increment its frequency
                freq.put(element, freq.get(element) + 1);
            }
            }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        int maxFreq = 0;
        int ansKey = -1;

        for(var e : freq.entrySet()){
            if (e.getValue() > maxFreq){        //-- Checking if current frequency is greater than maximum frequency
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, maxFreq);
        }
    }

