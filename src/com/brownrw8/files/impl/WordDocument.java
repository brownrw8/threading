package com.brownrw8.files.impl;

import com.brownrw8.files.AFile;
import com.brownrw8.tasks.impl.PrintingTask;
import com.brownrw8.tasks.impl.RenderingTask;
import com.brownrw8.tasks.impl.SavingTask;
import com.brownrw8.tasks.impl.SpellingTask;

import java.util.ArrayList;

/**
 * Created by Rob on 4/9/2016.
 */
public class WordDocument extends AFile {

    public WordDocument(String name){
        super(name);
        this.tasks = new ArrayList<>();
        tasks.add(new SpellingTask(this));
        tasks.add(new SavingTask(this));
        tasks.add(new PrintingTask(this));
        tasks.add(new RenderingTask(this));
    }

}

