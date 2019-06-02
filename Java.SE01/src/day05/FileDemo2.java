package day05;


import java.io.IOException;
import java.io.File;
import java.util.regex.PatternSyntaxException;

/**
 *
 * File 操作文件
 * 创建一个空文件夹
 * @author codingbear
 *
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {

        /**
         *
         * 在当前根目录下创建一个text.txt文件
         */

        File file = new File( "text.txt" );

        if (!file.exists()){
            file.createNewFile();
            System.out.println("创建文件成功");
        }


    }
}
