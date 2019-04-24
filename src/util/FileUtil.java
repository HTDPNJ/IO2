package util;

import java.io.Closeable;
import java.io.IOException;

public class FileUtil
{
    /*工具类关闭流*/
    public static void close(Closeable ... io) throws IOException
    {
        for(Closeable temp:io){
            if(null!=temp)
                temp.close();
        }
    }

    /*使用泛型*/
    public static <T extends  Closeable> void closeAll(T ...io)throws IOException{
        for(Closeable temp:io){
            if(null!=temp)
                temp.close();
        }
    }
}
