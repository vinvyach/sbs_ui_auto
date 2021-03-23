package utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Random {

    public static String phone;

    public static String getPhone() {
        return phone;
    }

    public static String newPhone() {

        return phone = "9" + Arrays
                .stream(new java.util.Random()
                        .ints(9, 0, 9)
                        .toArray())
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());


    }
}
