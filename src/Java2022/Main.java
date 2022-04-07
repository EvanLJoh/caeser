package Java2022;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("plaintext: ");
        String message = text.nextLine();
        System.out.println("\nrotation: ");
        int num = text.nextInt();

        while (num < 1 || num > 25) {
            System.out.println("too high or too low try again please (1-25): ");
            num = text.nextInt();
        }

        String ciphertext = "";
        char letters;

        if (num > 0 && num < 26) {
            for (int i = 0; i < message.length(); i++) {
                letters = message.charAt(i);
                if (letters >= 'a' && letters <= 'z') {
                    letters = (char) (letters + num);
                    if (letters > 'z') {
                        letters = (char) (letters + 'a' - 'z' - 1);
                    }
                    ciphertext = ciphertext + letters;
                } else if (letters >= 'A' && letters <= 'Z') {
                    letters = (char) (letters + num);
                    if (letters > 'Z') {
                        letters = (char) (letters + 'A' - 'Z' - 1);
                    }
                    ciphertext = ciphertext + letters;
                } else {
                    ciphertext = ciphertext + letters;
                }
            }
            System.out.print("\nciphertext: \n" + ciphertext);
        }
    }
}