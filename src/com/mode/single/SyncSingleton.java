package com.mode.single;
/**
 * 双重检查加锁
 * 只在第一次创建时才会同步，提高了性能
 * JDK1.4及更早版本不支持volatile关键字，所以不能再这些版本上实现该技巧
 */
public class SyncSingleton {
 private volatile static SyncSingleton mInstance;
 private SyncSingleton() {
 }
 public static SyncSingleton getInstance() {
  if (mInstance == null) {
   synchronized (SyncSingleton.class) {
    mInstance = new SyncSingleton();
   }
  }
  return mInstance;
 }
}