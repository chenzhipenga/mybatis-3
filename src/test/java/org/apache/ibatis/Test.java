package org.apache.ibatis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) {
//    List<? extends Class<? extends Serializable>> classes = Arrays.asList(String.class, Integer.class);
    List<Class> classes = new ArrayList<>();
    classes.add(String.class);
    classes.add(Integer.class);
    Class[] objects = new Class[0];
    System.out.println(objects.length);
//    Class[] classes1 = classes.toArray(new Class[0]);
    Class[] classes1 = classes.toArray(objects);

    System.out.println(classes1.length);
    objects = new Class[5];
    System.out.println(objects.length);
  }
}
