import java.util.Scanner;

 

public class UserSentance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;
        System.out.println("Enter sentance with blank (use _____ for blank)");
        input = s.nextLine();
        String words[] = input.split(" ");
        int blank = 0;
        StringBuffer output = new StringBuffer();

 

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("-") || words[i].contains("_")) {
                blank++;
            }
        }

 

        String verbs[] = new String[blank];
        for (int i = 0; i < blank; i++) {
            System.out.println("Enter " + (i + 1) + " blank value");
            verbs[i] = s.nextLine();
        }

 

        for (int i = 0, k = 0; i < words.length; i++) {
            if (words[i].contains("-") || words[i].contains("_")) {
                output.append(verbs[k] + " ");
                k++;
            } else {
                output.append(words[i] + " ");
            }
        }
        System.out.println("completed string is " + output);
    }
}