/** hello world program */

import java.util.*;


public class helloworld {
  public static void main(String[] args) {
    ATypeName a = new ATypeName();
    System.out.println("Hello World!");
    System.out.println(a.i);
    System.out.println(a.c);

    // The variable is placed on the stack
    char c = 'x';
    System.out.println(c);

    // Non primitive object which is placed on the heap
    Character ch = new Character('y');
    System.out.println(ch);
  }
}
