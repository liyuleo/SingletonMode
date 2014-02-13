package com.mode.single;
/**
 * "急切"创建实例 依赖JVM在加载这个类时马上创建此唯一的对象。JVM保证在任何线程访问mInstance静态变量之前，一定先创建此实例。
 * 适用于：应用程序总是创建并使用该对象，或者在创建和运行时负担不太繁重。
 */
public class EagerlySingleton {
 private static EagerlySingleton mInstance = new EagerlySingleton();
 private EagerlySingleton() {
 }
 public static EagerlySingleton getInstance() {
  return mInstance;
 }
}