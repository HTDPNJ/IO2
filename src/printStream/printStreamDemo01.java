package printStream;

import java.io.*;

public class printStreamDemo01
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintStream ps=System.out;
        //输出到文件
        String path="F:\\java_CODE\\IO\\File\\new\\b\\C\\print.txt";
        File src=new File(path);
        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(src)));
        ps.println("io is so easy...");
        ps.close();
    }
}
