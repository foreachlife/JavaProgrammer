package basic.io;

import java.io.*;

/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class ByteArrayInputStreamTest {


    public static void main(String[] args) throws IOException {
        String word = "the best heart are always bravest";
        ByteArrayInputStream in = new ByteArrayInputStream(word.getBytes("UTF-8"));
        //byte reader
        byte[] bytes = new byte[1024];
        int len = 0;
        while (((len = in.read(bytes)) != -1)) {
            System.out.println("ByteReader: " + new String(bytes, 0, len));
        }
        in.close();
        //byte writer
        ByteArrayInputStream in2 = new ByteArrayInputStream(word.getBytes("UTF-8"));
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        while ((len = in2.read(bytes)) != -1) {
            byteOut.write(new String(bytes, 0, len).getBytes());
        }
        System.out.println("ByteWriter: " + new String(byteOut.toByteArray()));
        in2.close();
        byteOut.close();
    }
}
