package first_day_13th_november_2017;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeORNot {

/*
 * Complete the function below.
 */
static int isPrime(long n) {
    for(int i = 2; i <= n/2; i++) {
        if(n % i == 0) {
            return i;
        }
    }
    return 1;
}
public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    final String fileName = System.getenv("OUTPUT_PATH");
    BufferedWriter bw = null;
    if (fileName != null) {
        bw = new BufferedWriter(new FileWriter(fileName));
    }
    else {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    int res;
    long n;
    n = Long.parseLong(in.nextLine().trim());

    res = isPrime(n);
    bw.write(String.valueOf(res));
    bw.newLine();

    bw.close();
    in.close();
}
}
