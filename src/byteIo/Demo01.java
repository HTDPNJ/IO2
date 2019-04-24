package byteIo;
import java.io.*;

/*
* 读取文件
* 1、建立联系 File对象
* 2、选择流 文件输入流 InputStream FileInputStream
* 3、操作 byte[] car=new byte[1024:+read+读取大小
* 输出 flush
* 4、释放资源，关闭
*
* 写出文件
* 1、建立联系 File对象
 * 2、选择流 文件输出流 OutputStream FileOutputStream
 * 3、操作 write
 * 4、释放资源，关闭*/
public class Demo01
{
    public static void main(String[] args)
    {
        String path="F:/java_CODE/IO/File/123.txt";
        get(path);
    }
    public static void get(String path)
    {
        File file=new File(path);
        InputStream inputStream=null;
        try{
            inputStream=new FileInputStream(file);
            byte[] car=new byte[1024];
            int len=0; //实际读取大小
            while (-1!=(len=inputStream.read(car))){
                System.out.println(new String(car,0,len));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("文件不存在");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("文件读取失败");
        }finally {
            //4、释放资源
            if(null!=inputStream){
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("关闭文件输入流失败");
                }
            }
        }
    }
}
