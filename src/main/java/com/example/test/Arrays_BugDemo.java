package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Arrays_BugDemo
 * Package: com.example.test
 * Description:
 *
 * @Author 贾正发
 * @Create 2024/11/27 20:19
 * @Version 1.0
 */
public class Arrays_BugDemo {
    public static void main(String[] args)
    {
        /**
         *  使用工具类 Arrays.asList（） 把数组转换成集合时，不能使用其修改集合相关的方法，
         *  它的 add remove / clear 方法会抛出 UnsupportedOperationException 异常。
         *  如果非要使用，可以套一层ArrayList
         */
        //List<Integer> list = Arrays.asList(1,2);
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2));
        list.add(3);

        list.forEach(System.out::println);
    }
}
