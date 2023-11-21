package dk.javahandson;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        exercise1(); // Finished
        exercise2(); // Finished
        exercise3(); // Finished
        exercise4(); // Finished
        exercise5(); // Finished - spaces dont show up
        exercise6(); // Finished
        exercise7(); // Finished
        //exercise8(); // Unfinished - Figure out detecting upper/lower case of prior letter
    }
    private static void exercise1() // From any user input surround the input with tags like <input>. Print the result
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();

        System.out.println("<" + input + ">");
    }
    private static void exercise2() // From any user input. Count the amount of characters in the input and write the numbers on the screen
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();

        int stringSize = input.trim().length();
        System.out.println(stringSize);
    }
    private static void exercise3() // From any user input, separate each character in the string with a "@"
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++)
        {
            System.out.print(input.charAt(i) + "@");
        }
    }
    private static void exercise4() // From any user input, write the input characters backwards
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();

        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }
    private static void exercise5() // From any user input, convert to morse code
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();

        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0' };
        String[] code = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };
        for (int i = 0; i < input.length(); i++)
            for (int j = 0; j < letter.length; j++){
                if (input.charAt(i) == letter[j])
                    {
                        System.out.print((code[j])+ " ");
                        break;
                    }
            }

    }
    private static void exercise6() // From any user input, check if contains "Horse", "Saddle" or "Spores". If it does, replace with * corresponding to word length
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();

        input = input.replace("horse", "*****");
        input = input.replace("saddle", "******");
        input = input.replace("spores", "******");
        System.out.println(input);
    }
    private static void exercise7() // From any user input, write the input characters backwards
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();

        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input + input1);
    }
    private static void exercise8() // From any user input, convert every letter to upper/lower case every other letter, so it goes like "YoUr MiLeAgE mAy WaRy"
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();


    }
}