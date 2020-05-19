import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Main {

    //Runs the program, methods are outside the main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:  ");
        String userResponse = scanner.nextLine();

        //Call the 3 Methods in the main method and pass the created String variable userResponse in each method
        isAString(userResponse);
        flippedCase(userResponse);
        reverseString(userResponse);
    }

    //Must create each methods first to output. Done outside of main method


    //Number? or String? using if/else to determine true or false
    public static void isAString(String aString){
        //output to console using isNumeric static method in StringUtils class imported above from the pom.xml  <groupId>org.apache.commons</groupId>
        System.out.println("You entered: " + aString);
            //condition of the if statement
        if(StringUtils.isNumeric(aString)){
            //if statement evaluates to true, then do something (print it out)
            System.out.println(aString + " is a number");
        }else{
            //if statement is not true, do the else statement (print something else out)
            System.out.println(aString + " is not a number");
        }
    }



    public static void flippedCase(String aString){
        //output to console using swapCase static method in StringUtils class imported above from the pom.xml  <groupId>org.apache.commons</groupId>
        System.out.println("Flipped Case: " + StringUtils.swapCase(aString));
    }



    public static void reverseString(String aString){
        //output to console using reverse static method in StringUtils class imported above from the pom.xml  <groupId>org.apache.commons</groupId>
        System.out.println("Reverse Case: " + StringUtils.reverse(aString));
    }
}

