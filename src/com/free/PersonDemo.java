package com.free;

import java.io.Serializable;

public class PersonDemo implements Serializable {
    private static final long serialVersionUID=35L;
    private String name;
    //测试新增一个属性
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
