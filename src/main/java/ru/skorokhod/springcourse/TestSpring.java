package ru.skorokhod.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic firstClassicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);
        ClassicalMusic secondClassicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);


        System.out.println(firstClassicalMusic.getSong());
        System.out.println(secondClassicalMusic.getSong());

        context.close();
    }
}
