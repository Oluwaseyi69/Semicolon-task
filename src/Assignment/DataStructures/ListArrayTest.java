package Assignment.DataStructures;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListArrayTest {
    @Test
    public void testThatListCanBeCreated(){
         ListArray listArray = new ListArray();
         assertNotNull(listArray);
    }

    @Test
    public void testThatListIsEmpty(){
        ListArray listArray = new ListArray();
        assertTrue(listArray.isEmpty());
    }
    @Test
    public void testThatListCanBeAdded(){
        ListArray listArray = new ListArray();
        listArray.add("4");
        listArray.add("5");
        assertEquals("4",listArray.get(0));
        assertEquals("5",listArray.get(1));

    }


}








//
//import java.util.Collection;
//import java.util.Iterator;
//
//public class ArrayList {
////    private int result;
//private int [] arr;
//private int counter;
//private static int initialCapacity;
//    public static void main(String[] args) {
//        ArrayList arr = new ArrayList();
//            arr.add(5);
//            arr.add(6);
//            arr.add(3);
////            nums.equals(3);
//
//        System.out.println(arr);
//
//    }
//
//       public void add (int element){
//        int[] arr; counter = element;
//       }
//    //            public void add(Object e) {
////            }
////            public int add(int number) {
////            result+=number;
////            return result;
////            }
////            public void add(int number){
////            result+=number;
////            }
////            public int getResult(){
////                return result;
////            }
//
//            public int size() {
//                return 0;
//            }
//            public boolean isEmpty() {
//                return false;
//            }
//
//            public  boolean contains(Object o) {
//                return false;
//            }
//
//            public  Iterator iterator() {
//                return null;
//            }
//
//            public  Object[] toArray() {
//                return new Object[0];
//            }
//
//            public  Object[] toArray(Object[] objects) {
//                return new Object[0];
//            }
//
//
//
//
//            public  boolean remove(Object o) {
//                return false;
//            }
//
//            public  boolean addAll(Collection collection) {
//                return false;
//            }
//
//            public  void clear() {
//
//            }
//
//    @Override
//    public boolean equals(Object o) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }
//
////            public boolean equals(Object o) {
////                return false;
////            }
////
////            public int hashCode() {
////                return 0;
////            }
//
////            public Spliterator spliterator() {
////                return Collection.super.spliterator();
////            }
////
////            public Stream stream() {
////                return Collection.super.stream();
////            }
////
////            public Stream parallelStream() {
////                return Collection.super.parallelStream();
////            }
//
//            public  boolean retainAll(Collection collection) {
//                return false;
//            }
//
//            public  boolean removeAll(Collection collection) {
//                return false;
//            }
//
//            public  boolean containsAll(Collection collection) {
//                return false;
//            }
//
//
//
//
//        };
//
////    }
////
////}