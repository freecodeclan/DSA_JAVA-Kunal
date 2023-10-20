/* Question -- Question -- Create a HashMap using Java HashMap class to store the following pairs(Person,Age) and display them.
  Akash 21
  Harsh 31
  Juhi 28
  Vandana 27
  Gaurav 33
  */
package Map;
import java.util.*;
public class HashmapDemo {
    static void HashMapMethod(){

        Map<String, Integer> mp = new HashMap<>();  //-- Creating an object of HashMap

        mp.put("Akash",21);     //-- .put() is used to insert an element
        mp.put("Harsh", 31);
        mp.put("Juhi", 28);
        mp.put("Vandana", 27);
        mp.put("Gaurav", 33);

        System.out.println(mp);
        System.out.println(mp.get("Juhi"));     //--> .get(key) tell about the value stored in the particular key
        System.out.println(mp.keySet());        //--> .keySet() gives us all the keys present in entry
        System.out.println(mp.entrySet());      //--> .entrySet() gives us all the keys and values
        System.out.println(mp.getClass());      //--> .getClass() tells about class of an object

        //--> Traversing on HashMap entries

        //- iterating over ".keySet()"
        for (String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }

        System.out.println();

        //-- Iterating over ".entrySet()"
        for (Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        //-- Iterating using it For each loop
        for (var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }


    }
    public static void main(String[] args) {
        HashMapMethod();

    }
}
