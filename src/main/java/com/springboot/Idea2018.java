package com.springboot;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/5/8
 * Time: 22:41
 */
public class Idea2018 {

    private Integer id;

    private String name;

    private String password;

    public Idea2018(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }



    public void test(){

    }

    @Override
    public String toString() {
        return "Idea2018{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
