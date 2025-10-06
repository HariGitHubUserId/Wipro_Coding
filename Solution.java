import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void changeArray() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        int N = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");

        // Stream-based filtering of perfect squares
        List<String> perfectSquares = Arrays.stream(parts)
            .map(Integer::parseInt)
            .filter(num -> {
                int sqrt = (int) Math.sqrt(num);
                return sqrt * sqrt == num;
            })
            .map(String::valueOf)
            .collect(Collectors.toList());

        // Write output
        if (perfectSquares.isEmpty()) {
            bw.write("-1");
        } else {
            bw.write(String.join(" ", perfectSquares));
        }

        br.close();
        bw.close();
    }
}

