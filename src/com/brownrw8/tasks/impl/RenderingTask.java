package com.brownrw8.tasks.impl;

import com.brownrw8.files.IFile;
import com.brownrw8.tasks.ATask;

/**
 * Created by Rob on 4/9/2016.
 */
public class RenderingTask extends ATask{

    public RenderingTask(IFile file){
        super(file);
    }

    public void run(){
        System.out.println("Rendering " + this.file.getName() + "...");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished rendering " + this.file.getName() + ".");
    }
}
