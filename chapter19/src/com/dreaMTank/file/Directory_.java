package com.dreaMTank.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 林
 * @versoin 1.0
 */
public class Directory_ {
    public static void main(String[] args) {


    }
    //判断e：\\news1.txt是否存在，如果存在就删除

     @Test
    public void m1(){
        String filePath = "/Users/apple/news1.txt";
        File file = new File(filePath);

        if(file.exists()){
           if( file.delete()){
               System.out.println("删除成功");
           }else {
               System.out.println("删除失败");
           }
        }else {
            System.out.println("该文件不存在");
        }
    }

    //判断D:\\demo02 是否存在，如果存在就删除，否则就不存在
    //在java中，目录也是特殊的文件
    @Test
    public void m2(){
        String filePath = "/Users/apple/demo02";
        File file = new File(filePath);

        if(file.exists()){
            if( file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("该目录不存在");
        }
    }


    //判断 D:\\demo\\a\\b\\c 目录是否存在，如果存在就提示已经存在，否则就创建/Users/apple/demo/a/b/c
    @Test
    public void m3() {

        String directoryPath = "/Users/apple/demo/a/b/c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "存在..");
        } else {
            if (file.mkdirs()) { //创建一级目录使用mkdir() ，创建多级目录使用mkdirs()
                System.out.println(directoryPath + "创建成功..");
            } else {
                System.out.println(directoryPath + "创建失败...");
            }
        }



    }


}
