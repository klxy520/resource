package com.xnky.taotao.observer.test1;


public class Tset {
	public static void main(String[] args) {
        Teacher teacher=new Teacher();
        StudentA studentA=new StudentA();
        StudentB  studentB=new StudentB();
        StudentC   studentC=new StudentC();
        teacher.addObserver(studentC);
        teacher.addObserver(studentA);
        teacher.addObserver(studentB);
        teacher.setNumber("110");
        System.out.println("==============");
        teacher.setNumber("119");
        System.out.println("==============");
        teacher.setNumber("130");
        System.out.println("==============");
        teacher.setNumber("160");
	}
}
