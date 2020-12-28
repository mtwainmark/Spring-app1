package ru.skorokhod.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music musicRock = context.getBean("rockMusic", Music.class);
        System.out.println(musicRock.getSong());
        Music musicClassical = context.getBean("classicalMusic", Music.class);
        System.out.println(musicClassical.getSong());

        context.close();
    }
}
