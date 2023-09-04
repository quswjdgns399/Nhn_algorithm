package algorithm0904;

public class Main {
    public static String solution(String input) {

        StringBuilder stringBuilder = new StringBuilder();

        char[] arr = input.toCharArray();

        for (char x : arr) {
            if (x >= 65 && x <= 90) {
                stringBuilder.append((char) (x + 32));
            } else if (x >= 97 && x <= 122) {
                stringBuilder.append((char) (x - 32));
            } else {
                stringBuilder.append(x);
            }

        }
        return stringBuilder.toString();
    }

}
