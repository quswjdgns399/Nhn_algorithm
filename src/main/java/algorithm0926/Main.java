package algorithm0926;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numberOfPerson = sc.nextInt();
        int removeNumber = sc.nextInt();

        josephus(numberOfPerson, removeNumber);
    }


    public static void josephus(int numberOfPerson, int removeNumber) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numberOfPerson; i++) {
            queue.add(i);
        }

        System.out.printf("<");
        while (queue.size() >= 1) {

            for (int i = 0; i < removeNumber - 1; i++) {
                int remove = queue.poll();
                queue.add(remove);
            }

            if (queue.size() == 1) {
                System.out.printf(String.valueOf(queue.poll() + 1));
            } else {
                System.out.printf(queue.poll() + 1 + ", ");
            }
        }
        System.out.printf(">");

    }

}
