package buffered;

import java.io.*;

public class BufferedCharDemo
{
    public static void main(String[] args)
    {

    }
    public static void copy(File src, File dest){
        BufferedReader reader=null;
        BufferedWriter writer=null;
        try{
            reader=new BufferedReader(new FileReader(src));
            writer=new BufferedWriter(new FileWriter(dest));
            String line=null;
            while(null!=(line=reader.readLine())){
                writer.write(line);
                writer.newLine();
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
