package byteIo;
import java.io.*;

/*
*
* 写出文件
* 1、建立联系 File对象
 * 2、选择流 文件输出流 OutputStream FileOutputStream
 * 3、操作 write
 * 4、释放资源，关闭*/
public class byteIoDemo02
{
    public static void main(String[] args)
    {
        String path="F:/java_CODE/IO/File/byteIoDemo02.txt";
        get(path);
    }
    public static void get(String path)
    {
        File file=new File(path);
        OutputStream outputStream=null;
        try{
            outputStream=new FileOutputStream(file,true);
            String s="写出文件";
            byte[] out=s.getBytes();
            out=s.getBytes();
            outputStream.write(out,0,out.length);
            outputStream.flush(); //强制刷新出去
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("文件不存在");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("文件写出失败");
        }finally {
            if(null!=outputStream){
                try {
                    outputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
