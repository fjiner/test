package collection;

import charactor.Hero;

import java.util.ArrayList;

/**
 * @Author: FengJin
 * @Date: 2020/10/14 10:26
 */
public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        heros.add( new Hero("盖伦"));
        System.out.println(heros.size());

        //容器的容量"capacity"会随着对象的增加，自动增长
        //只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
        heros.add( new Hero("提莫"));
        System.out.println(heros.size());

    }

}
