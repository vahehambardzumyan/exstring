import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter word");
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        String a=frontBack(str);
        System.out.println(a);
    }
    public static String frontBack(String str)  {
    String b=str.substring(0,1);
    String c=str.substring(1,str.length()-1);
    String d=str.substring(str.length()-1,str.length());

        return d+c+b;
    }
}