package ATACJAVA.CodMagnetic.ArrayListMagnet;

import java.util.*;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "unu");
        a.add(2, "doi");
        a.add(3, "trei");
        printAL(a);
        
        a.remove(2);
        if(a.contains("trei")) {
            a.add("patru");
        }
        printAL(a);

        if(a.indexOf("patru") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);
        printAL(a);

        
    }

    public static void printAL(ArrayList<String> al) {
        for(String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    
}
