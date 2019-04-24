package SplitFile;

import util.FileUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RndDemo01
{
    public static void main(String[] args) throws IOException
    {
        String path="F:\\java_CODE\\IO\\src\\printStream\\BufferedIn.java";
        RandomAccessFile rnd=new RandomAccessFile(new File(path),"r");
        byte[] flush=new byte[1024];
        int len=0;
        while(-1!=(len=rnd.read(flush))){
            if (len >= 20) System.out.println(new String(flush, 0, 20));
            else {
                System.out.println(new String(flush, 0, len));
            }
        }
        FileUtil.close(rnd);
    }
}
