/* Printing series from a to z */
package Strings;

public class AtoZ {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            System.out.println(ch);
        }
    }
}
