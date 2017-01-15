package hackerrank1.java.com.vaquar.hackerrank.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * 
 * 
 */
public class FastScanner {

    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);

    }

    public FastScanner(InputStream in) throws Exception {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = new StringTokenizer(reader.readLine().trim());
    }

    public int numTokens() throws Exception {
        if (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine().trim());
            return numTokens();
        }
        return tokenizer.countTokens();
    }

    public boolean hasNext() throws Exception {
        if (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine().trim());
            return hasNext();
        }
        return true;
    }

    public String next() throws Exception {
        if (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine().trim());
            return next();
        }
        return tokenizer.nextToken();
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(next());
    }

    public float nextFloat() throws Exception {
        return Float.parseFloat(next());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(next());
    }

    public int nextInt() throws Exception {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray() throws Exception {
        String[] line = reader.readLine().trim().split(" ");
        int[] out = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            out[i] = Integer.valueOf(line[i]);
        }
        return out;
    }

    public double[] nextDoubleArray() throws Exception {
        String[] line = reader.readLine().trim().split(" ");
        double[] out = new double[line.length];
        for (int i = 0; i < line.length; i++) {
            out[i] = Double.valueOf(line[i]);
        }
        return out;
    }

    public Integer[] nextIntegerArray() throws Exception {
        String[] line = reader.readLine().trim().split(" ");
        Integer[] out = new Integer[line.length];
        for (int i = 0; i < line.length; i++) {
            out[i] = Integer.valueOf(line[i]);
        }
        return out;
    }

    public BigInteger[] nextBigIngtegerArray() throws Exception {
        String[] line = reader.readLine().trim().split(" ");
        BigInteger[] out = new BigInteger[line.length];
        for (int i = 0; i < line.length; i++) {
            out[i] = new BigInteger(line[i]);
        }
        return out;
    }

    public String nextLine() throws Exception {
        return reader.readLine().trim();
    }

    public BigInteger nextBigInteger() throws Exception {
        return new BigInteger(next());
    }
}
