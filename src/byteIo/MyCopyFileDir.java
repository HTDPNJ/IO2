package byteIo;

import java.io.File;
public class MyCopyFileDir
{
    public static void main(String[] args)
    {
        String path="F:\\java_CODE\\IO\\File\\new";
        String destpath="F:\\java_CODE\\IO\\File\\copydir";
        new File(destpath).mkdir();
        dirlist(destpath,path);
    }
    public static void dirlist(String destpath,String path){
        File file=new File(path);
        File[] subFiles=file.listFiles();
        for(File tem:subFiles){
            if(tem.isFile()){
                String filename=tem.getName();
                String finalPath=destpath+tem.getAbsolutePath().replace(path,"");
                FileUtil.copyFile(tem.getAbsolutePath(),finalPath);
            }else{
                String finalPath=destpath+tem.getAbsolutePath().replace(path,"");
                new File(finalPath).mkdir();
                dirlist(finalPath,tem.getAbsolutePath());
            }
        }
    }
}
