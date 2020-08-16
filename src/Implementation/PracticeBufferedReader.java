import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeBufferedReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);  // InputStreamReader:getting the data from the keyboard
        //FileReader fr = new FileReader("C:\\dibs.txt"); // FileReader: getting the data from the text file
        BufferedReader brr = new BufferedReader(isr);
        System.out.println("Enter your name");
        String name = brr.readLine();
        System.out.println(("Your name is "+ name));
    }
}
