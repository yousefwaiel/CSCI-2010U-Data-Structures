import java.util.Stack;

public class Driver {

    public static boolean isValid(String sentence)
    {
        Stack<Character> stack = new Stack<>();

        for (char c : sentence.toCharArray())
        {
            if (c =='(' || c =='{' || c =='[') {
                stack.push(c);

            } else if (stack.empty()) {
                return false;
            }
            else if(c == ')' && stack.pop() != '(' || c == '}' && stack.pop() != '{' || c == ']' && stack.pop() != '[')
            {
                return false;
            }
        }
        return stack.empty();
    }



    public static void main(String[] args) {

        String sentence = "(){}[]";
        System.out.println(isValid(sentence));

    }
}