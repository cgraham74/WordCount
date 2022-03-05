/**
Created by Chrissy on 3/2/2022
*/
import java.util.Scanner;
import java.io.File;


public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("pg996.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            words += line.split(" ").length;
            System.out.println(line);
        }

        System.out.println("The file contains: " + words + " words.");
    }

}
