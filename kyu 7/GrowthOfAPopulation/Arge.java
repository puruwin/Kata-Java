class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        //p0 + p0 * percent + aug
        int n = 0;
        percent = percent/100;
        while (p0 < p) {
            p0 += p0 * percent + aug;
            n++;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.print(nbYear(1500, 5, 100, 5000));
    }
}