package hackerrank1.java.com.vaquar.codechef.sept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @see http://www.codechef.com/SEPT14/problems/ROTATION/
 * 
 * 
 */
public class FunWithRotation {

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] in = sc.nextIntArray();
        CircularIntArray arr = new CircularIntArray(in);
        while (m > 0) {
            m--;
            String q = sc.next();
            if (q.equals("R")) {
                // get element at index i
                out.println(arr.get(sc.nextInt()));
            } else if (q.equals("C")) {
                // rotate CW by d
                arr.rotateClockwise(sc.nextInt());
            } else {
                // rotate CCW by d
                arr.rotateCounterClockwise(sc.nextInt());
            }
        }
        out.close();
    }

    private static class CircularIntArray {
        private final int[] elements;
        private final int len;
        private int rotation;

        public CircularIntArray(int[] elements) {
            this.elements = elements;
            this.len = elements.length;
        }

        public void rotateClockwise(int offset) {
            this.rotation += offset;
            // Clamp rotation such that 0 <= rotation < len
            this.rotation %= len;
            if (this.rotation < 0)
                this.rotation += len;
        }

        public void rotateCounterClockwise(int offset) {
            this.rotation -= offset;
            // Clamp rotation such that 0 <= rotation < len
            this.rotation %= len;
            if (this.rotation < 0)
                this.rotation += len;
        }

        public int get(int position) {
            // One-based indexing
            return this.elements[(position + rotation + len - 1) % len];
        }
    }

    private static class FastScanner {

        private static BufferedReader reader;
        private static StringTokenizer tokenizer;

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

        public BigInteger nextBigInteger() throws Exception {
            return new BigInteger(next());
        }

        public String nextLine() throws Exception {
            return reader.readLine().trim();
        }

        public long[] nextLongArray() throws Exception {
            String[] line = reader.readLine().trim().split(" ");
            long[] out = new long[line.length];
            for (int i = 0; i < line.length; i++) {
                out[i] = Long.valueOf(line[i]);
            }
            return out;
        }

        public char[] nextCharArray() throws IOException {
            String[] line = reader.readLine().trim().split(" ");
            char[] out = new char[line.length];
            for (int i = 0; i < line.length; i++) {
                out[i] = line[i].charAt(0);
            }
            return out;
        }
    }
}
