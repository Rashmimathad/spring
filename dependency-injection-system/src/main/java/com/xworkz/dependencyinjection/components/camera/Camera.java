package com.xworkz.dependencyinjection.components.camera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Camera {


    private int id;
    private String name;
    @Autowired
    private Lens lens;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Lens getLens() {
        return lens;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lens=" + lens +
                '}';
    }

}
