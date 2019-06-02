package Text;

import java.io.File;

/**
 *
 * 删除多级文件夹
 *
 * @author codingbear
 */

public class deletFileDemo {
    public static void main(String[] args) {
        File file = new File("demo");    
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File dir : files) {
                if (!dir.delete()) {
                    String dirStr = dir.getAbsolutePath();
                    File file1 = new File(dirStr);
                    if (file1.isDirectory()){
                        File[] files1 = file1.listFiles();
                        for ( File dir1:files1 ){
                            if(!dir1.delete()){
                            }else {
                                dir1.delete();
                            }
                        }
                        file1.delete();
                    }
                }
            }
            file.delete();
        }
    }
}
