package edu.sdccd.cisc191;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        while (scnr.hasNext()) {
            String photo_name = scnr.nextLine();
            String modified = modify(photo_name);
            System.out.println(modified);
        }
        scnr.close();
    }

    private static String modify(String s) {
        int index = s.indexOf("photo.jpg");
        return s.substring(0, index) + "info.txt";
    }
}
