import java.util.Scanner;

/**
 * Created by jc300556 on 30/08/17.
 */
public class BabyNameComparison {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] firstNames = new String[3];

        for(int i = 0; i < firstNames.length; i++){
            System.out.println(String.format("Enter name %s: ", i+1));
            firstNames[i] = input.nextLine();
        }

        for(int i = 0; i < firstNames.length; i++){
            for(int j = 0; j < firstNames.length; j++){
                System.out.println(String.format("%s %s", firstNames[i], firstNames[j]));
            }
        }
    }
}
