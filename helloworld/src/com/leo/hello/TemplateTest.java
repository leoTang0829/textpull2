package com.leo.hello;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author tang
 * @date 2019/6/15  - 13:05
 */
public class TemplateTest {
    //模板6 prsf 定义静态私有变量
    private static final Integer A=1;
    //变形 psf 定义public
    public static final Integer NUM=1;
    //变行 psfi
    public static final int NUm1=2;
    //变形 psfs
    public static final String String2="1234";
    //模板1 psvm
    public static void main(String[] args) {

        //模板2 sout

        System.out.println("hello");
        //soutp  输出形参

        System.out.println("args = [" + args + "]");
        // /soutm 输出方法名
        System.out.println("TemplateTest.main");
        int num=1;
        //soutv 输出变量值
        System.out.println("num = " + num);
        //num.sout
        System.out.println(num);
        //模板3 fori
        String[] arr=new String[]{"tom" ,"jerry","hanlei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变相iter 增强for
        for (String s : arr) {
            System.out.println(s);
        }
        //变形itar 普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //list.for 增强for循环
        ArrayList arrayList=new ArrayList();
        arrayList.add(3);
        for (Object o : arrayList) {
            System.out.println();
        }
        //list.fori 普通遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //list.forr 倒叙遍历
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
        //模板五 ifn 判断是否为null
        ArrayList list=new ArrayList();
        if (list == null) {

        }
        //inn if not null
        if (list != null) {

        }
        //list.nn
        if (list != null) {

        }
        //ist.null
        if (list == null) {

        }
        String s = new String("123");
        //模板6 prsf


    }
    @Test
    public void test01(){

    }
}
