package com.example.test;

import java.util.HashSet;

/**
 * ClassName: HashConflictDemo
 * Package: com.example.test
 * Description:Hshcode案例 当new对象超过11w就会出现
 *
 * @Author 贾正发
 * @Create 2024/11/27 20:03
 * @Version 1.0
 */
public class HashConflictDemo {
    static class Person
    {
        int id;
    }

    public static void main(String[] args)
    {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 1; i <=10 * 10000; i++) {
            int personHashCode = new Person().hashCode();
            if(!hashSet.contains(personHashCode))
            {
                hashSet.add(personHashCode);
            }else{
                System.out.println("发生了hash冲突,在第"+i+"次，值是："+personHashCode);
            }
        }
        System.out.println(hashSet.size());

        System.out.println();
        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());
        System.out.println();
        System.out.println("柳柴".hashCode());
        System.out.println("柴柕".hashCode());

    }

}
