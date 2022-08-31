package basic.io;

import java.io.*;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class FileReadAndWriterByStreamTest {


    public static void main(String[] args) throws IOException {
        String path = "aaa.txt";
        String writeFile = "bbb.txt";
        //StreamReader
        InputStreamReader in = new InputStreamReader(new FileInputStream(path), "UTF-8");
        int len;
        while ((len = in.read()) != -1) {
            System.out.print((char) len);
        }
        in.close();
        //StreamWriter
        FileOutputStream fileOutputStream = new FileOutputStream(writeFile);
        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
        writer.write("the world is a fine place and worth fight for it ");
        writer.flush();
        writer.close();
    }
}
