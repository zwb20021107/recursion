import java.io.File;

public class RecursionDme1 {
    public static void main(String[] args) {
        File srcFile = new File("C:\\fileSet");
        getAllFilePath(srcFile);
    }

    //遍历给定目录的所有内容
    public static void getAllFilePath(File srcFile) {
        //获取给定目录下所有扽文件和目录的数组
        File[] fileArray = srcFile.listFiles();

        //遍历File数组, 得到每一个File对象
        if(fileArray != null)
        {
            for (File f : fileArray)
            {
                //判断是否为目录
                if(f.isDirectory())
                {
                    System.out.println();
                    System.out.println(f.getAbsolutePath());
                    getAllFilePath(f);
                }

                else
                {
                    System.out.println(f.getAbsolutePath());
                }

            }

        }



    }
}
