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


    public static String rch;

    public static String getRch() {
        return rch;
    }

    public static String newRCh() {

        return rch = "5" + Arrays
                .stream(new java.util.Random()
                        .ints(20, 0, 9)
                        .toArray())
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());


    }


    public static String inn;

    public static String getInn() {
        return inn;
    }

    public static String newInn() {

        return rch = "1" + Arrays
                .stream(new java.util.Random()
                        .ints(12, 0, 9)
                        .toArray())
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());


    }

}
