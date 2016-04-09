package com.brownrw8.files;

import com.brownrw8.tasks.ITask;
import java.util.List;

/**
 * Created by Rob on 4/9/2016.
 */
public abstract class AFile implements IFile {

    private final String name;
    protected List<ITask> tasks;


    public AFile(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void start(){
        for(ITask task : tasks){
            task.start();
        }
    }
}
