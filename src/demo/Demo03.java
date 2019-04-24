package demo;

import java.io.File;
import java.io.IOException;

public class Demo03
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        test3();
    }
    public static void test1(){
        File src=new File("F:\\java_CODE\\IO\\File\\123.txt");
        System.out.println(src.getName());
        System.out.println(src.getPath());
        System.out.println(src.getAbsolutePath());
        System.out.println(src.getParent());
    }
    public static void test2(){
        File src=new File("F:\\java_CODE\\IO\\File\\123.txt");
        System.out.println("文件是否存在："+src.exists());
        System.out.println("文件是否可写："+src.canRead());
        System.out.println("是否是文件："+src.isFile());
        System.out.println("是否是文件夹："+src.isDirectory());
        System.out.println("文件长度："+src.length()); //不能读取文件夹长度
    }
    //创建删除文件
    public static void test3() throws IOException, InterruptedException
    {
        File src=new File("F:\\java_CODE\\IO\\File\\new123.txt");
        if(!src.exists()){
            boolean flag=src.createNewFile();
            if (flag) {
                System.out.println("文件创建成功");
            }
        }
        File temp=File.createTempFile("tes",".temp",new File("F:\\java_CODE\\IO\\File"));
        Thread.sleep(5000);
        long time=System.currentTimeMillis();
        System.out.println(time);

    }
}
