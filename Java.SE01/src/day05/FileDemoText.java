package day05;

import java.io.File;
import java.io.IOException;

public class FileDemoText {
    public static void main(String[] args) throws IOException {

        File file = new File("demo");

        if ( !file.isDirectory() ){
                File[] files = file.listFiles();

            for ( File sub:files ){
                sub.getAbsolutePath();
            }
        }

    }
}
