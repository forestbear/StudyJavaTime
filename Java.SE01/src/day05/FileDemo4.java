package day05;

import java.io.File;

/**
 *
 * 创建一个目录
 * @author codingbear
 *
 *
 */
public class FileDemo4 {

    public static void main(String[] args) {

        File file = new File("demo");

        if (!file.exists()){
            file.mkdir();
        }

    }
}
