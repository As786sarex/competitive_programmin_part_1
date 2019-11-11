package sem3;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(infixToPostfix(sc.nextLine()).toString());

    }

    private static StringBuilder infixToPostfix(String str) {
        Stack<Character> stact = new Stack<>();
        StringBuilder res = new StringBuilder();
        if (str.trim().isEmpty()) {
            System.out.println("String is empty");
            return res;
        } else {
            for (int i = 0; i < str.length(); ++i) {
                char ch = str.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    res.append(ch);
                } else if (ch == '(') {
                    stact.push(ch);
                } else if (ch == ')') {
                    while(!stact.isEmpty()&&stact.peek()!='(')
                        res.append(stact.pop());
                    if (!stact.isEmpty()&&stact.peek()!='(')
                        System.out.println("invalid expression");
                    stact.pop();
                }
                else{
                    if (!stact.isEmpty()&&precedence(ch)<=precedence(stact.peek())){
                        if (stact.peek() == '(') {
                            System.out.println("invalid expression");
                        }
                        res.append(stact.pop());

                    }
                    stact.push(ch);
                }
            }
            while (!stact.isEmpty()){
                if (stact.peek()=='(')
                    System.out.println("invalid expression");
                res.append(stact.pop());
            }
        }

        return res;
}

    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}
