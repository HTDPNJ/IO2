package Others;

import java.io.*;

public class ByteArrayDemo01
{
    /*字节数组节点流*/
    public static void main(String[] args)
    {

    }
    public static void read(byte[] src)throws IOException
    {
        InputStream byis=new BufferedInputStream(
                new ByteArrayInputStream(src)
        );

        byte[]flush=new byte[1024];
        int len=0;
        while(-1!=(len=byis.read(flush))){
            System.out.println(new String(flush));
        }
    }
    public static byte[] write() throws IOException
    {
        byte[]dest;
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        String msg="hello world";
        byte[] info=msg.getBytes();
        bos.write(info,0,info.length);

        dest=bos.toByteArray();
        bos.close();
        return dest;
    }
}
