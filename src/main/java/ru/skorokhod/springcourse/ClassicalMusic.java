package ru.skorokhod.springcourse;

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
