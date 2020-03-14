package com.xfkj.javase.resouce.collection;

/**
 * 集合总结
 * 1.在集合框架的类继承体系中，最上方有两个接口：collection和Map
 *  *Collection表示一组纯数据(vlaue值集合)
 *  *Map表示一组key-value对键值对
 *  1.1Collection体系中有三种集合：Set、List、Queue
 *    *Set(集)： 元素是无序的且不可重复。
      *list(列表)：元素是有序的且可重复。
      *Queue(队列)：封装了数据结构中的队列。
 *   1.1.1 ArrayList
 *       *底层实现是数组, 问元素效率高,即查询快、插入、修改、删除元素慢 线程 不安全
         *ArrayList数组是一个可变数组，可以存取包括null在内的所有元素
        *每个ArrayList实例都有一个容量，该容量是指用来存储列表元素的数组的大小
        *随着向ArrayList中不断增加元素，其容量自动增长
       *自动增长会带来数据向新数组的重新拷贝
 *
 */
public class CollectionTest {
}
