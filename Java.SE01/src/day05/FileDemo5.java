package day05;

import java.io.File;

/**
 *
 * 创建文件夹
 *
 * @author codingbear
 *
 */
public class FileDemo5 {
    public static void main(String[] args) {

        File dir = new File("demo");

        if (dir.isDirectory()){
            File[] files = dir.listFiles();

            for (File file :files){

                System.out.println( file.getName() );
            }

            File file = new File("demo"+File.separator+"demo.txt");

            if (file.exists()){
                file.delete();
            }
        }


    }
}
