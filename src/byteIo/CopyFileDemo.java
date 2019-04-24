package byteIo;

import java.io.*;

import static byteIo.FileUtil.copyFile;

public class CopyFileDemo
{
    public static void main(String[] args)
    {
        String srcPath="F:/java_CODE/IO/File/byteIoDemo02.txt";
        String destPath="F:/java_CODE/IO/File/byteIoDemo02Copy.txt";
        copyFile(srcPath,destPath);
    }


}
