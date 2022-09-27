import java.io.*;
import java.util.*;

public class Regex_Spliting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        scan.close();
        s = s.trim();

        if (s.length() == 0) {
            System.out.println(0);
            System.exit(0);
        }
        String string[] = s.split("[!,?._'@ ]+");
        System.out.println(string.length);
        for(int i=0;i<string.length;i++){
            System.out.println(string[i]);
        }

    }
}







