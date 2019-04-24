package demo;

import java.io.File;

public class Demo05
{
    public static void main(String[] args)
    {
        File src=new File("F:\\java_CODE\\IO\\File");
        test(src);
    }
    public static void test(File file){
        if(file.isFile()){
            System.out.println(file.getAbsolutePath());
        }else if(file.isDirectory()){
            for(File temp:file.listFiles()){
                test(temp);
            }
        }
    }
}
