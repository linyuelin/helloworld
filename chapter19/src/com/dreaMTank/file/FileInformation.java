package com.dreaMTank.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 林
 * @versoin 1.0
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    @Test
    public void InFo() {
        //先创建文件
        File file = new File("/Users/apple/news2.txt");


        System.out.println("文件名字=" + file.getName());
        System.out.println("绝对路径=" + file.getAbsolutePath());
        System.out.println("父级目录=" + file.getParent());
        System.out.println("文件大小=" + file.length());
        System.out.println("是否存在" + file.exists());
        System.out.println("是否是文件" + file.isFile());
        System.out.println("是否是目录" + file.isDirectory());

    }

}
