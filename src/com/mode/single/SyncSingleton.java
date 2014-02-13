package com.mode.single;
/**
 * ˫�ؼ�����
 * ֻ�ڵ�һ�δ���ʱ�Ż�ͬ�������������
 * JDK1.4������汾��֧��volatile�ؼ��֣����Բ�������Щ�汾��ʵ�ָü���
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