import java.util.Stack;

public class Driver {

    public static String removeDuplicates(String sentence)
    {
        Stack<Character> stack = new Stack<>();


        for(char c:sentence.toCharArray())
        {
            if (stack.empty())
            {
                stack.push(c);
            } else if (c == stack.peek())
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }

        }

        return stack.toString();
    }

    public static void main(String[] args) {
        String sentence = "abbaca";
        System.out.println(removeDuplicates(sentence));
    }
}