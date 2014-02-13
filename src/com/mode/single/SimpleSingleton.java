package com.mode.single;
/**
 * ����ͨ�ĵ���ģʽ
 * �����ڲ���Ҫ���Ƕ��߳����еĳ���
 */
public class SimpleSingleton {
 private static SimpleSingleton mInstance;
 private SimpleSingleton() {//������˽�л�������ֻ��ͨ�� getInstance��������ȡʵ��
 }
 public static SimpleSingleton getInstance() {//�ṩȫ�ַ��ʵ�
  if (mInstance == null) {//�ӳ�ʵ������ֻ����Ҫ�ö���ʱ�Żᴴ����
   //�����ڶ��߳�Ӧ�û����£�����ط����ܻᵼ�����ɶ��ʵ����
   //��Ϊ����߳������е�����ط���ʱ�򣬻�û��ʵ�����ڣ���˶�ͨ���������жϣ����������˶��ʵ����
   //�����������ַ���������������
   mInstance = new SimpleSingleton();
  }
  return mInstance;
 }
}