package Others;

import java.io.*;

public class DataDemo02
{
    public static void main(String[] args) throws IOException
    {
        byte[] data=write();
        System.out.println(data.length);
        read(data);
    }
    /*数据+类型 输出到字节数组*/
    public static byte[] write() throws IOException
    {
        byte[] dest=null;
        double point=2.5;
        long num=100L;
        String str="数据类型";
        ByteArrayOutputStream bos=new ByteArrayOutputStream();

        DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(bos));
        dos.writeDouble(point);
        dos.writeLong(num);
        dos.writeUTF(str);
        dos.flush();
        dest=bos.toByteArray();
        dos.close();
        return dest;
    }
    /*从字节数组中读取数据+类型*/
    public static void read(byte[]src)throws IOException{
        DataInputStream dis=new DataInputStream(
                new BufferedInputStream(new ByteArrayInputStream(src))
        );
        double point=dis.readDouble();
        System.out.println(point);
        long num=dis.readLong();
        System.out.println(num);
        String str=dis.readUTF();
        System.out.println(str);
    }
}
