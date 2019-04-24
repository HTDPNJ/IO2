package printStream;

import java.io.*;
import java.util.Scanner;

public class SystemDemo01
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //打印输出重定向到文件
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(
                "F:\\java_CODE\\IO\\File\\new\\b\\C\\ori.txt"
        )),true));
        System.out.println("a");
        //打印输出到控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(
                FileDescriptor.out
        )),true));
        System.out.println("va");

    }
    public static void test2() throws FileNotFoundException{
        InputStream is=System.in;
        is=new BufferedInputStream(new FileInputStream("F:\\java_CODE\\IO\\File\\new\\b\\C\\print.txt"));
        Scanner sc=new Scanner(is);
        System.out.println(sc.nextLine());
    }
}
