package ru.skorokhod.springcourse;

import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{

    private ClassicalMusic(){ }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("Initialize");
    }

    public void doMyDestroy(){
        System.out.println("Destruction");
    }
}
