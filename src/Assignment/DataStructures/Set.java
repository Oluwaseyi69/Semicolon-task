package Assignment.DataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
//import java.util.Set;

public interface Set<E> extends Collection<E>  {
    public static void main(String[] args) {
        Set<Integer> numSet = (Set<Integer>) new HashSet<Integer>();
        numSet.add(5);
        numSet.add(5);

        System.out.println(numSet);
    }


}