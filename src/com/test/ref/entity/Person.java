package com.test.ref.entity;

/**
 * Created by Administrator on 2018/7/1.
 */
public class Person {
    public Person (){

    }
    //字段
    public String name;
    protected int age;
    char sex;
    @SuppressWarnings("unused")
    private String phone;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sex=" + sex
                + ", phone=" + phone + "]";
    }
}
