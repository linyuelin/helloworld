package com.dreaMTank.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;

import java.io.IOException;

/**
 * @author 林
 * @versoin 1.0
 * 演示FileInputStream的使用，（字节文件输入流 文件->程序）
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /*
     演示单个字节的读取，效率比较低
     */
    @Test
    public void readFile01(){
        String filePath = "/Users/apple/hello.txt";
        FileInputStream fileInputStream = null;
        int readDate = 0;
        try {
            //创建FileInputStream 对象，用于读取文件
             fileInputStream = new FileInputStream(filePath);

           while( (readDate=fileInputStream.read()) != -1){
               System.out.print((char)readDate);//转成char显示
           }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


 /*
 使用read（byte[]b）读取文件，提高效率
 */

    @Test
    public void readFile02(){
        String filePath = "/Users/apple/hello.txt";
        byte [] buf = new byte[8];
        FileInputStream fileInputStream = null;
        int readLen = 0;
        try {
            //创建FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);

            while( (readLen = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf,0, readLen));//转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}














