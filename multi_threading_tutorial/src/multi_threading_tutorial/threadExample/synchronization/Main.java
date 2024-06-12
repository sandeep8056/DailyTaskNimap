package multi_threading_tutorial.threadExample.synchronization;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String str = "2[ab]3@[cde]4[efgh]";
        String result = decodeString(str);
        System.out.println(result);
    }

    public static String decodeString(String s) {
        // Base case: if the string doesn't contain any brackets, return it as is
        if (!s.contains("["))
            return s;

        // Regular expression to match the pattern: [string]
        Pattern pattern = Pattern.compile("(\\d+)\\[([a-zA-Z]+)\\]");
        Matcher matcher = pattern.matcher(s);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            int repeat = Integer.parseInt(matcher.group(1));
            String substr = matcher.group(2);

            // Repeat the substring 'repeat' times and append it to the result
            for (int i = 0; i < repeat; i++) {
                sb.append(substr);
            }

            // Replace the matched pattern with the repeated substring
            matcher.appendReplacement(sb, "");
        }
        matcher.appendTail(sb);

        // Recursively decode any nested strings
        return decodeString(sb.toString());
    }
}
