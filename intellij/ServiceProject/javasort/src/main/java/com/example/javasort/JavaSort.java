package com.example.javasort;

import com.example.util.SortUtil;

import java.util.Collections;
import java.util.List;

public class JavaSort implements SortUtil {
    @Override
    public <T extends Comparable> List<T> sortList(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
