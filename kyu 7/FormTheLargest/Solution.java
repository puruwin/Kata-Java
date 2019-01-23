public class Solution {
    public static long maxNumber(long n) {
        String strN = String.valueOf(n);
        String sN = "";
        int arrayN[] = new int[strN.length()];
        for (int i = 0; i < strN.length(); i += 2) {
        	boolean flag = true;
			int temp;
            arrayN[i] = Integer.parseInt(String.valueOf(strN.charAt(i)));
            arrayN[i+1] = Integer.parseInt(String.valueOf(strN.charAt(i+1)));
			while (flag){
				flag = false;
				for(int j=0; j<strN.length()-1; j++){
					if(arrayN[j]<arrayN[j+1]){
						temp = arrayN[j];
						arrayN[j] = arrayN[j+1];
						arrayN[j+1] = temp;
						flag = true;
					}
				}
			}
        }
        for (int i = 0; i < strN.length(); i++) {
        	sN += arrayN[i];
        }
		n = Long.valueOf(sN).longValue();
        return n;
    }
	public static void main (String[] args) {
		System.out.println(String.valueOf(maxNumber(566797)));
	}
}

