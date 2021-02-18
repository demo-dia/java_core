package com.interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }


}
