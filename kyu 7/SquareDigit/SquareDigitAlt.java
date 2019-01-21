public class SquareDigitAlt {

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
    
    public static int squareDigits(int n) {
        String result = "";
        while (n != 0) {
            int digit = n % 10;
            result += digit * digit;
            n /= 10; 
        }
        return Integer.parseInt(result);
    }
  }