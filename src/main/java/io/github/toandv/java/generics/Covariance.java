package io.github.toandv.java.generics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by toan on 6/16/16.
 */
public class Covariance {
    public static void main(String[] args) {
        String[] s = new String[2];
        Object[] o = s;
        o[0] = 1;
    }

    public static <T extends Cloneable & Iterable & Map> T get() {
        return null;
    }
}
