package kr.ac.dgd;

import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
//        FileExample3 : 481p

        Vector v = new Vector();
        v.add(1);
        v.add(2);

        Enumeration enumeration = v.elements();
        SequenceInputStream sis = new SequenceInputStream(enumeration);
    }
}
