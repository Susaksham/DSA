package Postifx;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String input = "A+(B*C-(D/E*F)*G)*H";
        String result = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < input.length(); i++){
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
                result = result + input.charAt(i);
            } else{
                if(input.charAt(i) == ')'){
                    while(!stack.isEmpty() && stack.peek() != '('){
                        Character c = stack.pop();
                        result = result + c;
                    }
                   if(!stack.isEmpty()){
                       stack.pop();
                   }
                }
               else if(input.charAt(i) == '('){
                    stack.push(input.charAt(i));
                }

                else if(stack.isEmpty() || (priority(input.charAt(i)) > priority(stack.peek()))){
                    stack.push(input.charAt(i));
                } else{
                    while( !stack.isEmpty() && priority(input.charAt(i)) <= priority(stack.peek()) && stack.peek() != '('){
                        Character c = stack.pop();
                        result = result + c;
                    }
                    stack.push(input.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);

    }
    public static int priority (char character){
        if(character == '^'){
            return 4;
        }
        if(character == '/' || character == '*'){
            return 3;
        }

        if(character == '-' || character == '+'){
            return 2;
        }
        return 0;
    }
}
//ABC*DE/F*G*-H*+