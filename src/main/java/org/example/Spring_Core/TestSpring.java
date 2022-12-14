package org.example.Spring_Core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Дмитрий Крпушов 27.08.2022
 */
public class TestSpring {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext - обращается к applicationContext.xml,считывает и помещает бины в applicationContext.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //Второй аргумент, бин которого хотим получить
        //Music music = context.getBean("musicBean",Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        //Закрываем context. Обязательно.
        context.close();
    }
}
