import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter word");
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        System.out.println(notString(str));
    }
    public static String notString(String str) {
        String not= "not";

        if (str.indexOf("not")>=0){
            return str;
        }else {
             return  "not" + " " +str;
            }
        }

    }
