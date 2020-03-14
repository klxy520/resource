package com.xfkj.java8.dome;

import java.io.Serializable;

public class Person implements Serializable {
  private  Integer id;
  private String sex;
  private  String name;
  private  Integer num;
  private  Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Person(Integer id, String sex, String name, Integer num, Double salary) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", salary=" + salary +
                '}';
    }
    public  Person(){

    }
    public Person(String sex, String name){
        this.sex=sex;
        this.name=name;
    }
}
