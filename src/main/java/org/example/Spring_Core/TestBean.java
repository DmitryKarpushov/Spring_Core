package org.example.Spring_Core;

/**
 * @author Дмитрий Крпушов 27.08.2022..
 */
public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
