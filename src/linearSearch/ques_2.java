/* Checked whether the targeted value present in  string or not  */
package linearSearch;

import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String sc;
        System.out.println("Enter the name: ");
        sc = st.next();

        char ch = 'b';

        System.out.println(search(sc, ch));


    }
    static boolean search(String str, char target){
        if (str.isEmpty()){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
