package demo;

import java.io.File;
import java.io.FilenameFilter;

public class Demo04
{
    public static void main(String[] args)
    {
        test1();
    }
    public static void test1(){
        String path="F:\\java_CODE\\IO\\File";
        File src=new File(path);
        if(src.isDirectory()){
            System.out.println("子目录|文件名");
            String[]subNames=src.list();
            for(String temp:subNames){
                System.out.println(temp);
            }
        }

        if(src.isDirectory()){
            File[]subFiles=src.listFiles();
            for(File temp:subFiles){
                System.out.println(temp.getAbsolutePath());
            }
        }
        //命令设计模式
        if(src.isDirectory()){
            FilenameFilter filter=new FilenameFilter()
            {
                @Override
                public boolean accept(File dir, String name)
                {
                    return new File(dir,name).isFile()&&name.endsWith(".java");
                }
            };
            File[]subFiles=src.listFiles(filter);
            System.out.println("设计模式");
            for(File temp:subFiles){
                System.out.println(temp.getAbsolutePath());
            }
        }
    }
}
