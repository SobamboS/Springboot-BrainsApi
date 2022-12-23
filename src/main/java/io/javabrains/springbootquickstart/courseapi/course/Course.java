package io.javabrains.springbootquickstart.courseapi.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course{
    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private String description;
    private String name;

    public Course(){

    }

    public Course(String id,String description,String name){
        this.id=id;
        this.description=description;
        this.name=name;
    }

    public String getId( ){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getDescription( ){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getName( ){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

}
