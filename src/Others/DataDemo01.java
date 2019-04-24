package Others;

import java.io.*;

public class DataDemo01
{
    public static void main(String[] args) throws IOException
    {
        String path="F:\\java_CODE\\IO\\File\\dir\\new\\b\\C\\num.txt";
        write(path);
        read(path);
    }
    /*数据+类型 输出到文件*/
    public static void write(String destPath) throws IOException
    {
        double point=2.5;
        long num=100L;
        String str="数据类型";
        //创建源
        File dest=new File(destPath);
        //选择流
        DataOutputStream dos=new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(dest))
        );
        dos.writeDouble(point);
        dos.writeLong(num);
        dos.writeUTF(str);
        dos.flush();
        dos.close();
    }
    /*从文件中读取数据+类型*/
    public static void read(String srcPath)throws IOException{
        File src=new File(srcPath);
        DataInputStream dis=new DataInputStream(
                new BufferedInputStream(new FileInputStream(src))
        );
        double point=dis.readDouble();
        System.out.println(point);
        long num=dis.readLong();
        System.out.println(num);
        String str=dis.readUTF();
        System.out.println(str);
    }
}
