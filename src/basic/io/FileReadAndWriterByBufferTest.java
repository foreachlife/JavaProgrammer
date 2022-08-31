package basic.io;

import java.io.*;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class FileReadAndWriterByBufferTest {


    public static void main(String[] args) throws IOException {
        String path = "aaa.txt";
        String writeFile = "bbb.txt";
        //BufferedReader
        InputStreamReader in = new InputStreamReader(new FileInputStream(path), "UTF-8");
        BufferedReader bf = new BufferedReader(in);
        String str;
        while ((str = bf.readLine()) != null) {
            System.out.print(str);
        }
        bf.close();
        in.close();
        //BufferedWriter
        FileOutputStream fileOutputStream = new FileOutputStream(writeFile);
        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("the world is a fine place and worth fight for it ");
        bw.flush();
        bw.close();
        writer.flush();
        writer.close();
    }
}
