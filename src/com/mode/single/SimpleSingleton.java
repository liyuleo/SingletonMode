package com.mode.single;
/**
 * 最普通的单例模式
 * 适用于不需要考虑多线程运行的场景
 */
public class SimpleSingleton {
 private static SimpleSingleton mInstance;
 private SimpleSingleton() {//构造器私有化，这样只能通过 getInstance方法来获取实例
 }
 public static SimpleSingleton getInstance() {//提供全局访问点
  if (mInstance == null) {//延迟实例化，只在需要该对象时才会创建。
   //但是在多线程应用环境下，这个地方可能会导致生成多个实例。
   //因为多个线程在运行到这个地方的时候，还没有实例存在，因此都通过了条件判断，进而创建了多个实例。
   //后面会介绍两种方法来解决这个问题
   mInstance = new SimpleSingleton();
  }
  return mInstance;
 }
}