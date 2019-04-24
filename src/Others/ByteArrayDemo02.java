package Others;



import java.io.*;

/*
* 文件--程序--字节数组
* 字节数组--程序--文件*/
public class ByteArrayDemo02
{
    public static void main(String[] args) throws IOException
    {
        byte[] data=getBytesFromFile("F:\\java_CODE\\IO\\File\\dir\\new\\b\\C\\TEST");
        System.out.println(new String(data));

        toFileFromByteArray(data,"F:\\java_CODE\\IO\\File\\dir\\new\\b\\C\\TEST2");
    }

    public static void toFileFromByteArray(byte[] src,String destPath)throws FileNotFoundException,IOException
    {
        //创建源
        //目的地
        File dest=new File(destPath);
        //字节数组输入流
        InputStream is=new BufferedInputStream(new ByteArrayInputStream(src));
        //文件输出流
        OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));

        byte[] flush=new byte[1024];
        int len=0;
        while(-1!=(len=is.read(flush))){
            //写出到文件
            os.write(flush,0,len);
        }
        os.flush();
        os.close();
    }
    public static byte[] getBytesFromFile(String srcPath)throws FileNotFoundException,IOException
    {
        //创建文件源
        byte[] dest=null;
        //创建字节数组目的地
        File src=new File(srcPath);

        InputStream is=new BufferedInputStream(new FileInputStream(src));
        ByteArrayOutputStream baos=new ByteArrayOutputStream();

        byte[] flush=new byte[1024];
        int len=0;
        while(-1!=(len=is.read(flush))){
            baos.write(flush,0,len);
        }
        baos.flush();
        dest=baos.toByteArray();
        return dest;
    }
}
