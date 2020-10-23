package crashCourse.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n = Integer.parseInt(br.readLine());
        int a = 3;
        if (Integer.toString(n * n).contains(Integer.toString(a))) {
            System.out.print("Results\n" +
                    "1.");
            System.out.println("It contains 3");
        } else System.out.println("There is no 3");
        StringBuilder sbr = new StringBuilder(Integer.toString(n));
        System.out.println("2.Reverse n - " + sbr.reverse());
        char[] chars = Integer.toString(n).toCharArray();
        char n1 = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = n1;
        System.out.println("3." + Integer.parseInt(new String(chars)));
        sbr.reverse().insert(sbr.length(), "1");
        System.out.println("4." + sbr.insert(0, "1"));
    }
}

