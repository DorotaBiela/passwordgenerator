package passwordgenerator;

import java.util.Random;

public class Generator {

    public static void main(String[] args) {
        int length = 10;
        System.out.println(password(length));
    }

    static char[] password(int len) {
        System.out.println("Generowanie hasła przy pomocy funkcji random()");
        System.out.println("Twoje nowe hasło to: ");
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>()";
        String values = capitalChars + smallChars + numbers + symbols;
        Random random = new Random();
        char[] newPassword = new char[len];

        for (int i = 0; i < len; i++) {
            newPassword[i] = values.charAt(random.nextInt(values.length()));
        }
        return newPassword;
    }
}
