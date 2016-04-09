package com.brownrw8.tasks.impl;

import com.brownrw8.files.IFile;
import com.brownrw8.tasks.ATask;

/**
 * Created by Rob on 4/9/2016.
 */
public class SpellingTask extends ATask {

    public SpellingTask(IFile file){
        super(file);
    }

    public void run(){
        System.out.println("Checking the spelling in " + this.file.getName() + "...");
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished checking spelling in " + this.file.getName() + ".");
    }
}
