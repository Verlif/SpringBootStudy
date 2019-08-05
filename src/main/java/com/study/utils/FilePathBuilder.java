package com.study.utils;

import java.io.File;

public class FilePathBuilder {

    private final String SPLIT = "\\\\";
    private StringBuilder path;

    public FilePathBuilder() {
        path = new StringBuilder();
    }

    public FilePathBuilder addSinglePath(String sp) {
        path.append(sp);
        path.append(File.separator);
        return this;
    }

    public void toParent() {
        //将路径分解
        String[] part = path.toString().split(SPLIT);
        if (part.length > 1) {
            //获取最后一级路径长度
            int length = part[part.length - 1].length() + 1;
            path.delete(path.length() - length, path.length());
        }
    }

    public int pathLevel() {
        return path.toString().split(SPLIT).length;
    }

    public String toString() {
        return path.toString();
    }
}
