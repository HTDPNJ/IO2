package charIo;

import java.io.*;

public class CopyFile
{
    public static void main(String[] args)
    {
        String src="F:\\java_CODE\\IO\\src\\charIo\\writetext.txt";
        String dest="F:\\java_CODE\\IO\\src\\charIo\\copytext.txt";
        copy(new File(src),new File(dest));
    }
    public static void copy(File src,File dest){
        Reader reader=null;
        Writer writer=null;
        try{
            reader=new FileReader(src);
            writer=new FileWriter(dest);
            int len=0;
            char[]data=new char[1024];
            while(-1!=(len=reader.read(data))){
                writer.write(data,0,len);
                writer.flush();
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }finally {
            if(null!=reader) {
                try {
                    reader.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
