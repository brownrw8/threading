package com.brownrw8.tasks.impl;

import com.brownrw8.files.IFile;
import com.brownrw8.tasks.ATask;
/**
 * Created by Rob on 4/9/2016.
 */
public class PrintingTask extends ATask{

    public PrintingTask(IFile file){
        super(file);
    }

    public void run(){
        System.out.println("Printing " + this.file.getName() + "...");
        try {
            Thread.sleep(170);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished printing " + this.file.getName() + ".");
    }
}
