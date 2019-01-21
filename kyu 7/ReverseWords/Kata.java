public class Kata
{
    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
    }
    public static String reverseWords(final String original) {
        String reversed = "";
        char temp = '0';
        char[] myArray = original.toCharArray();
        for (int i = 0; i < myArray.length; i++) {
            temp = myArray[i];
            myArray[i] = myArray[(myArray.length - i) - 1];
            myArray[(myArray.length - i) - 1] = temp;
        }
        reversed = String.valueOf(myArray);
        return reversed;
    }
}