package byteIo;

import java.io.File;

public class CopyDir
{
    public static void main(String[] args)
    {
        String srcPath="F:\\java_CODE\\IO\\File\\new";
        String destPath="F:\\java_CODE\\IO\\File\\dir";
        File src=new File(srcPath);
        File dest=new File(destPath);
        copyDir(src,dest);
    }
    public static void copyDir(File src,File dest){
        if(src.isDirectory()){
            dest=new File(dest,src.getName());
            dest.mkdir();
        }
        copyDirDetial(src,dest);
    }
    public static void copyDirDetial(File src,File dest){
        if(src.isFile()){
            FileUtil.copyFile(src.getAbsolutePath(),dest.getAbsolutePath());
        }else{
            dest.mkdir();
            for(File tem:src.listFiles()){
                copyDirDetial(tem,new File(dest,tem.getName()));
            }
        }
    }
}

