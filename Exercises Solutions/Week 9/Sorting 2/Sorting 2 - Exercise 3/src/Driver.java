public class Driver {

    public static String sortSentence(String sentence)
    {
        String[] words = sentence.split(" ");
        String[] answer = new String[words.length];

        for (String word: words)
        {
            int i = word.length() - 1;
            int index = word.charAt(i) - '0';
            answer[index-1] = word.substring(0,i);
        }
        return String.join(" ", answer);
    }



    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}