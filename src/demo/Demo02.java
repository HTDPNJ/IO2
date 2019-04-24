package demo;

import java.io.File;

public class Demo02
{
    public static void main(String[] args)
    {
        String parentPath="F:\\java_CODE\\IO\\File";
        //相对路径
        File file=new File(parentPath,"photo.txt");
        file=new File(new File(parentPath),"photo.txt");
        //绝对路径
        file=new File("F:\\java_CODE\\IO\\File\\photo.txt");
    }
}
