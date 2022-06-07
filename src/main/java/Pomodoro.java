import java.util.Arrays;
import java.util.Scanner;

public class Pomodoro {

    // -w 1 -b 1 -count 1
    // split()
    // [-w, 1, -b, 1, -count, 1]

    public static void main(String[] args) {
        System.out.println("Hello pomodoro. Write command");

        // Read user unput
        String[] cmd = new Scanner(System.in).nextLine().split(" ");

        int workMin = 25; //work time
        int breakMin = 5; // rest time
        int count = 1; // Loops
        int sizePrint = 30; //ProgressBar length


        for (int i=0; i < cmd.length; i++) {
            switch (cmd[i]) {
                case "-help" -> {
                    System.out.println("-w - Work Time");
                    System.out.println("-b - break Time");
                    System.out.println("-count - Loops");
                }
                case "-w" -> workMin = Integer.parseInt(cmd[++i]);

                case "-count" ->  count = Integer.parseInt(cmd[++i]);

                case "-b" -> breakMin = Integer.parseInt(cmd[++i]);

            }

        }
        System.out.printf("Program parameters: WORK %d min, " +
                "REST %d min, loops %d", workMin, breakMin, count);
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        System.out.println("Pomodoro timer is gone: " + (endTime - startTime)/(1000*60) + "min");
    }

    private static void timer(int workTime, int breakTime, int sizeProgressBar) {

    }

}

