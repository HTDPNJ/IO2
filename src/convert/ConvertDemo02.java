package convert;

import java.io.*;

/*转换流：
* 字节转换为字符
* 1、输出流：OutPutSreamWriter
* 2、输入流：InputStreamReader*/
public class ConvertDemo02
{
    public static void main(String[] args) throws IOException,FileNotFoundException, UnsupportedEncodingException
    {
        String path="";
        File file=new File(path);
        File dest=new File("");
        BufferedReader br=new BufferedReader(
                new InputStreamReader(new FileInputStream(file),"UTF-8")
        );
        //写出文件
        BufferedWriter bw=new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(dest),"gbk")
        );
        String info=null;
        while(null!=(info=br.readLine())){
            bw.write(info);
            System.out.println(info);
        }
    }

}
