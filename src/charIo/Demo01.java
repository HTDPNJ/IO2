package charIo;
/*文件读取*/
import java.io.*;

public class Demo01
{
    public static void main(String[] args)
    {
        String path="F:\\java_CODE\\IO\\src\\charIo\\text";
        read(path);
    }
    public static void read(String path){
        File file=new File(path);
        char[]data=new char[1024];
        int len=0;
        Reader reader=null;
        try{
            reader=new FileReader(path);
            while(-1!=(len=reader.read(data))){
                System.out.println(new String(data,0,len));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("源文件不存在");
        }catch(IOException e){
            System.out.println("文件读取失败");
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
                System.out.println("关闭流失败");
            }
        }

    }
}
