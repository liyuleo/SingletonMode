package com.mode.single;
/**
 * "����"����ʵ�� ����JVM�ڼ��������ʱ���ϴ�����Ψһ�Ķ���JVM��֤���κ��̷߳���mInstance��̬����֮ǰ��һ���ȴ�����ʵ����
 * �����ڣ�Ӧ�ó������Ǵ�����ʹ�øö��󣬻����ڴ���������ʱ������̫���ء�
 */
public class EagerlySingleton {
 private static EagerlySingleton mInstance = new EagerlySingleton();
 private EagerlySingleton() {
 }
 public static EagerlySingleton getInstance() {
  return mInstance;
 }
}