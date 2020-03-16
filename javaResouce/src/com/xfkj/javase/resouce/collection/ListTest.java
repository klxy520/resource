package com.xfkj.javase.resouce.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sxf on 2020/3/14.
 * list(列表)：元素是有序的且可重复。
 */
public class ListTest {
    public static void main(String[] args) {
        //1.ArrayList 提供了三种方式的构造器
        //a.通过无参构造的话，初始数组容量为0 当使用add方法添加一个元素时，容量会被扩成10。
        //使用懒加载, 对于jdk1.6来说这算是一个优化，如果实例化后没有添加元素，容量是0，节约空间，否则为10
        List<String> list1=new ArrayList<>();
        /**b.在ArrayList底层构造一个初始容量为20的数组
         * 在底层源码1.6和1.7中， 当length<0时，会抛出IllegalArgumentException异常。
         *当length>0时 会初始化一个容量为length的数组
         * public ArrayList(int initialCapacity) {
         * super();
         * if (initialCapacity < 0)
         * throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
         * this.elementData = new Object[initialCapacity];
         * }
         * 在底层源码1.8中，对1.6和1.7做了优化 新增了一个当length=0时，也是赋值为空数组，但是重用了常量对象
         * public ArrayList(int initialCapacity) {
         * if (initialCapacity > 0) {
         * this.elementData = new Object[initialCapacity];
         * } else if (initialCapacity == 0) {
         * this.elementData = EMPTY_ELEMENTDATA;
         * } else {
         *  throw new IllegalArgumentException("Illegal Capacity: "+
         *  initialCapacity);
           }
         }
         */
        Integer length=20;
        list1= new ArrayList<>(length);
        list1.add("sxf");
        list1.add("小王");
        list1.add("小李");
        list1.add("aaa");
        System.out.println("list1："+list1);
        //c.构造一个指定集合的元素的列表，按照它们由集合的迭代器返回的顺序
        List<String> list=new ArrayList<>(list1);
        System.out.println("list："+list);
        //2.ArrayList是线程不安全的
        //ArrayList是未同步的，多线程并发读写时需要外部同步，
        // 如果不外部同步，那么可以使用Collections.synchronizedList方法对ArrayList的实例进行一次封装，
        // 或者使用Vector。
        List<String> list2 = Collections.synchronizedList(list);
         //ArrayList因为底层数组 elementData 的容量是不能改变的，所以容量不够时，
        // 需要把 elementData 换成一个更大的数组，这个过程叫作扩容。实际的元素的数量size，
        // 总是不会超过底层数组的容量 elementData.length，因为扩容需要申请更大的内存，
        // 并且需要原来数组的进行一次复制，所以扩容是个耗时的操作。在添加大量元素之前，
        // 使用者最好是预估一个大致的数量，手动调用ensureCapacity进行一次扩容操作，
        // 避免一个个添加导致频繁扩容影响性能。 


    }
}
