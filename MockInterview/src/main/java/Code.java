import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Code {
        public static boolean Palindrome(Object input) {

            //Convert the input to a string
            String stringInput = input.toString();

            //Convert the input to lower case
            String lowerCaseInput = stringInput.toLowerCase(Locale.ROOT);

            //Use string builder to make our word modifiable
            StringBuilder stringBuilder = new StringBuilder(lowerCaseInput);

            //use reverse method
            StringBuilder newInput = stringBuilder.reverse();

            //Convert the newWord back to a string
            String latestInput = String.valueOf(newInput);

            //Compare the strings and return the true if they are the same and false if they are diffrent
            return lowerCaseInput.equals(latestInput);
        }
}







