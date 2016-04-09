package com.brownrw8;

import com.brownrw8.files.IFile;
import com.brownrw8.files.impl.WordDocument;
import java.util.ArrayList;
import java.util.List;


public class Main {
    static int FILE_MAX = 100;

    public static void main(String[] args) {
        List<IFile> files = new ArrayList<>(FILE_MAX);

        for(int i=0;i<FILE_MAX;i++){
            files.add(new WordDocument("DOC_" + String.valueOf(i) + ".doc"));
        }

        for(IFile file : files){
            file.start();
        }

    }
}
