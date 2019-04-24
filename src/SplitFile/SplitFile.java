package SplitFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SplitFile
{
    //文件的路径
    private String filePath;
    //文件分割的存放路径
    private String destPath;
    //块数
    int size;
    //文件名
    private String fileName;
    //每块文件的大小
    private long blockSize;
    //每块的名称
    private List<String> blockPath;
    private long length;

    public SplitFile()
    {
        this.blockPath = new ArrayList<>();
    }
    public SplitFile(String filePath,String destPath )
    {
        this(filePath,destPath,1024);
    }
    public SplitFile(String filePath,String destPath, long blockSize)
    {
        this();
        this.destPath=destPath;
        this.filePath = filePath;
        this.blockSize = blockSize;
        init();
    }
    /*初始化操作，计算块数以及文件名*/
    public void init(){
        File src=null;
        if(null==filePath||!(src=new File(filePath)).exists()){
            return;
        }
        if(src.isDirectory())
            return;
        this.fileName=src.getName();
        //计算块数
        long length=src.length();
        if(this.blockSize>length)
            this.blockSize=length;
        //确定块数
        size=(int)Math.ceil(length*1.0/blockSize);
        initPathName(destPath);
    }
    private void initPathName(String destPath){
        for(int i=0;i<size;i++){
            this.blockPath.add(destPath+"/"+this.fileName+".parh"+i);
        }
    }
    /*文件的分割*/
    public void split(String destPath) throws IOException
    {
        long beginPos=0;
        long acutalBlockSize=blockSize;
        for(int i=0;i<size;i++){
            if(i==size-1){
                acutalBlockSize=this.length-beginPos;
            }
            splitDetail(i,beginPos,acutalBlockSize);
            beginPos+=acutalBlockSize;
        }
    }
    private void splitDetail(int idx,long beginPos,long actualBlockSize) throws IOException
    {
        File src=new File(this.filePath);
        File dest=new File(this.blockPath.get(idx));
        RandomAccessFile raf=new RandomAccessFile(src,"r");
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(dest));
        raf.seek(beginPos);
        byte[] flush=new byte[1024];
        int len=0;
        while(-1!=(len=raf.read(flush))){
            if((actualBlockSize-len)>=0){
                bos.write(flush,0,len);
                actualBlockSize-=len;
            }else{
                bos.write(flush,0,(int)actualBlockSize);
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        SplitFile file=new SplitFile("F:\\java_CODE\\IO\\src\\ObjectDemo01.java","F:\\java_CODE\\IO\\File\\new\\b\\C",1);
        file.split("F:\\java_CODE\\IO\\File\\new\\b\\C");
    }
}
