package Pilas;

import java.util.*;
public class Parentesis {
    public static void main(String[] args) {
        String linia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una oración:");
        linia = sc.nextLine();
        Stack<String> parentesis = new Stack<>();

        for (int i = 0; i < linia.length(); i++) {
            if (linia.charAt(i) == '(' || linia.charAt(i) == '[' || linia.charAt(i) == '{') {
                parentesis.push(String.valueOf(linia.charAt(i)));
            }

            else if (linia.charAt(i) == ')' || linia.charAt(i) == ']' || linia.charAt(i) == '}') {
                if (!parentesis.isEmpty() &&
                        ((linia.charAt(i) == ')' && parentesis.peek().equals("("))
                        || (linia.charAt(i) == ']' && parentesis.peek().equals("["))
                        || (linia.charAt(i) == '}' && parentesis.peek().equals("{")))) {
                    parentesis.pop();
                } else {
                    parentesis.push(String.valueOf(linia.charAt(i)));
                }
            }
        }
        if (parentesis.isEmpty()) {
            System.out.println("¡Todo correcto!");
        } else {
            System.out.println("ERROR: la oración no está bien balanceada.");
        }
    }
}


