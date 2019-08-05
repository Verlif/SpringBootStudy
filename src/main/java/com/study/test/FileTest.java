package com.study.test;

import com.study.utils.FilePathBuilder;
import org.fusesource.jansi.Ansi;

import java.io.File;
import java.util.Scanner;

public class FileTest {

    private static FilePathBuilder fpd;

    public static void main(String[] args) {
        fpd = new FilePathBuilder();
        fpd.addSinglePath("F:\\");
        while (true) {
            File file = new File(fpd.toString());
            File[] files = file.listFiles();
            showFileList(fpd.toString(), files);
            toDirectory(files);
        }
    }

    private static void showSomeInfo(FilePathBuilder fpd) {
        System.out.println("path: " + fpd.toString());
        System.out.println("pathLevel: " + fpd.pathLevel());
    }
    private static void showFileList(String path, File[] files) {
        int i = 0;
        System.out.println("path: " + path);
        System.out.println(i++ + ".返回上一级");
        for (; i < files.length; i++) {
            if (files[i].isDirectory())
                showDirectory(i, files[i].getName());
            else
                showFile(i, files[i].getName());
        }
    }
    private static void toDirectory(File[] files) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        switch (index) {
            case 0:
                fpd.toParent();
                break;
            default:
                index--;
                if (files[index].isDirectory())
                    fpd.addSinglePath(files[index].getName());
                break;
        }
    }

    private static void showDirectory(int i, String name) {
        System.out.println(Ansi.ansi().eraseScreen().fg(Ansi.Color.YELLOW).a(i + "." + name).reset());
    }
    private static void showFile(int i, String name) {
        System.out.println(Ansi.ansi().eraseScreen().fg(Ansi.Color.BLUE).a(i + "." + name).reset());
    }
}
