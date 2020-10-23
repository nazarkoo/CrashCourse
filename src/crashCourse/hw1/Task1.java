package crashCourse.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter measurement of brick");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        System.out.println("Enter measurement of hole");
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        boolean t = ((a <= x) & (b <= y))
                | ((a <= x) & (c <= y))
                | ((b <= x) & (c <= y))
                | ((a <= y) & (b <= x))
                | ((a <= y) & (c <= x))
                | ((b <= y) & (c <= x));
        if (t) System.out.println("Brick went into a hole");
        else System.out.println("Brick can not went into a hole");
    }
}

