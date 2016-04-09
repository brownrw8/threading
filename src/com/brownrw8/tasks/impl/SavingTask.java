package com.brownrw8.tasks.impl;

import com.brownrw8.files.IFile;
import com.brownrw8.tasks.ATask;

/**
 * Created by Rob on 4/9/2016.
 */
public class SavingTask extends ATask {

    public SavingTask(IFile file){
        super(file);
    }

    public void run(){
        System.out.println("Saving the document " + this.file.getName() + "...");
        try {
            Thread.sleep(110);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished saving " + this.file.getName() + ".");
    }
}
