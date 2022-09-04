package org.example.Spring_Core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Дмитрий Крпушов 27.08.2022
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("testBean",TestBean.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
