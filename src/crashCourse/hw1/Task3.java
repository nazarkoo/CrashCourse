package crashCourse.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter task num\n" +
                "1.Calculate radius\n" +
                "2.Question/answer\n" +
                "3.Count price of phone calls");
        String taskNum = br.readLine();
        switch (taskNum) {
            case "1":
                System.out.println("Enter radius");
                int rad = Integer.parseInt(br.readLine());
                System.out.println("Area is " + (Math.pow(rad, 2) * Math.PI));
                System.out.println("Perimeter is " + (2 * rad * Math.PI));
                break;
            case "2":
                System.out.println("What is your name?");
                String name = br.readLine();
                System.out.println("Where are you live, " + name + " ?");
                String address = br.readLine();
                System.out.println("So, your name is " + name + " and you live in " + address);
                break;
            case "3":
                double uaCost = 0.5;
                double ptCost = 0.85;
                double ukCost = 1.12;
                System.out.println("How long the call to Ukraine lasted?");
                int uaTime = Integer.parseInt(br.readLine());
                System.out.println("Call to Ukraine cost " + uaTime * uaCost);
                System.out.println("How long the call to Portugal lasted?");
                int ptTime = Integer.parseInt(br.readLine());
                System.out.println("Call to Portugal cost " + ptTime * ptCost);
                System.out.println("How long the call to England lasted?");
                int ukTime = Integer.parseInt(br.readLine());
                System.out.println("Call to England cost " + ukTime * ukCost);
                System.out.println("Together you spent "+((uaTime * uaCost)+(ptTime * ptCost)+(ukTime * ukCost)));
                break;
            default:
                System.out.println("You entered wrong number");
        }
    }
}
