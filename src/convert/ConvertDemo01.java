package convert;

import java.io.UnsupportedEncodingException;

public class ConvertDemo01
{
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        String str=new String("中国");
        byte[]data=str.getBytes();
        System.out.println(new String(data));

        data=str.getBytes("gbk");
        System.out.println(new String(data));
    }
}
