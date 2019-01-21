public class Solution {
    public static long maxNumber(long n) {
        String strN = String.valueOf(n);
        int arrayN[] = new int[strN.length()];
        for (int i = 0; i < strN.length(); i++) {
            arrayN[i] = Integer.parseInt((String.valueOf(strN[i])));
        }
        return 1; // Do your magic!
    }
}