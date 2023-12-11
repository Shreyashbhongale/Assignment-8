import java.util.Arrays;

public class Que1 {
    public static void main(String[] args) {
        int[] p = {12,18,20,38,53,93,77,61,59,56};

        for ( int i=0; i < p.length; i++) {
            if (p[i] > p[i+1]) {
                System.out.println(i+1+2001);
                break;
            }
        }
    }
}