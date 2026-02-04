package day19_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionsdemo {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("program started..");

//        try {
//            FileInputStream file = new FileInputStream("C:\\file.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        FileInputStream file = new FileInputStream("C:\\file.txt");
    }
}
