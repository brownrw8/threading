package com.brownrw8.tasks;

import com.brownrw8.files.IFile;

/**
 * Created by Rob on 4/9/2016.
 */
public abstract class ATask implements ITask{
    protected final IFile file;

    public ATask(IFile file){
        this.file = file;
    }

    public abstract void run();

    public void start(){
        Thread thread = new Thread(this);
        thread.start();
    }
}
