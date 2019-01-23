import java.util.*;

public class SolutionAlt {
    public static long maxNumber(long n) {
        char[] ary = (""+n).toCharArray();  
        Arrays.sort(ary); 
        return new Long(new StringBuilder(new String(ary)).reverse().toString());
    }
}