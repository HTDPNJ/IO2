package charIo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*文件写出*/
public class Demo02
{
    public static void main(String[] args)
    {
        //创建源
        String destPath="F:\\java_CODE\\IO\\src\\charIo\\writetext.txt";
        File destFile=new File(destPath);
        write(destFile);
    }
    public static void write(File file){
        char[]data="写入文件".toCharArray();
        Writer writer=null;
        try {
            writer=new FileWriter(file);
            writer.write(data);
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=writer) {
                try {
                    writer.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
