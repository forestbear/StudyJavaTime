package day05;

import java.io.File;

/**
 *
 *
 * 删除一个文件
 * @author codingbear
 *
 *
 */
public class FileDemo3 {

    public static void main(String[] args) {

        File file = new File( "text.txt" );

        if (file.exists()){
            file.delete();
        }

    }
}
