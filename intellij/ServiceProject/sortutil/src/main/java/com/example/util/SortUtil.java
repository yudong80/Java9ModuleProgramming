package com.example.util;

import java.util.List;

public interface SortUtil {
    <T extends Comparable> List<T> sortList(List<T> list);
}
