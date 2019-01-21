public class SquareDigit {

  public static void main(String[] args) {
      System.out.println(squareDigits(9119));
  }
  
  public static int squareDigits(int n) {
    String temp = Integer.toString(n);
    String cadNum = "";
    int result;
    int length = temp.length();
    int[] digitArray = new int[length];
    for (int i = 0; i < length; i++)
    {
      digitArray[i] = temp.charAt(i) - '0';    
    }
    for(int i = 0; i < length; i++) {
      cadNum += Integer.toString(digitArray[i] * digitArray[i]);
    }
    result = Integer.parseInt(cadNum);
    return result;
  }
}