package byteIo;

import java.io.*;

public class FileUtil
{
    public static void copyFile(String srcPath,String destPath){
        File srcFile=new File(srcPath);
        File destFile=new File(destPath);
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        if(srcFile.isDirectory())
            return; //拷贝文件，遇见文件夹返回

        try{
            fileInputStream=new FileInputStream(srcFile);
            fileOutputStream=new FileOutputStream(destFile,true);
            byte []data=new byte[1024];
            int len;
            while(-1!=(len=fileInputStream.read(data))){
                fileOutputStream.write(data,0,len);
            }
            fileOutputStream.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("文件不存在");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("读取文件失败");
        }finally{
            try{
                fileInputStream.close();
                fileOutputStream.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
