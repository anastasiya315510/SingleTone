package design_pattern.homework.genarate_val;

import lombok.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@Builder
public class RandomNumbersGenarator {

    private static Random random = new Random();
    private int from = 0;
    private int to = 10;

    public static int randomIntsGenerator( int from, int to) {
        return new Random()
                .ints( from, to+1)
                .findAny()
                .getAsInt();

    }



}
