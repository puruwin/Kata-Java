public class DnaStrand {
    public static void main(String[] args) {
        System.out.println(makeComplement("TAACG"));
    }
    public static String makeComplement(String dna) {
        String complement = "";
        char[] dnaArray = dna.toCharArray();
        for (int i = 0; i < dnaArray.length; i++) {
            switch (dnaArray[i]) {
                case 'A': dnaArray[i] = 'T';
                break;
                case 'T': dnaArray[i] = 'A';
                break;
                case 'C': dnaArray[i] = 'G';
                break;
                case 'G': dnaArray[i] = 'C';
                break;
            }
        }
        complement = String.valueOf(dnaArray);
        return complement;
    }
}