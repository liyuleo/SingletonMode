package com.mode.single;
import java.io.ObjectStreamException;
import java.io.Serializable;
public class Singleton implements Serializable {
 private static final long serialVersionUID = 1L;
 private static Singleton mInstance;
 private Singleton() {
 }
 public static Singleton getInstance() {
  if (mInstance != null) {
   mInstance = new Singleton();
  }
  return mInstance;
 }
 private Object readResolve() throws ObjectStreamException {
  return getInstance();
 }
}