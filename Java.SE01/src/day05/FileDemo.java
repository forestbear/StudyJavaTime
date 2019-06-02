package day05;

import java.io.File;

/**
 *
 * java.io.File
 *
 * @author codingbear
 *
 */
public class FileDemo {

    public static void main(String[] args) {
        File file = new File("."+File.separator+"demo.txt");

        String name = file.getName();

        System.out.println(name);

        boolean exists = file.exists();

        System.out.println(exists);

        long lenght = file.length();

        System.out.println(lenght);

        file.canRead();
        file.canWrite();
        file.canExecute();


    }
}
