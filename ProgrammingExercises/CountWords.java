import com.sun.deploy.util.ArrayUtil;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jc300556 on 30/08/17.
 */
public class CountWords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Type in a sentence: ");
        String userInput = input.nextLine();

        int wordCount = 0;

        boolean inWord = true;

        for (int i = 0; i < userInput.length(); i++){
            char currentLetter = userInput.charAt(i);

            if(!Character.isAlphabetic(currentLetter)){
                if(isWordBreakCharacter(currentLetter)){
                    System.out.println("Word break");
                    if(inWord){
                        wordCount += 1;
                        inWord = false;
                    }
                }
            }else{
                inWord = true;
            }
        }

        if(inWord){
            wordCount += 1;
        }

        System.out.println(String.format("Your sentence contains %s words", wordCount));
    }

    private static boolean isWordBreakCharacter(char character){
        char[] wordSeparators = {' ', '.', ',', ';','?','!','-'};

        for (char tmpChar:wordSeparators) {
            if(tmpChar == character){
                return true;
            }
        }
        return false;
    }
}
