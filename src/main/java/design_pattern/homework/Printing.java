package design_pattern.homework;

import com.google.inject.internal.util.ToStringBuilder;
import design_pattern.homework.dto.Exercise;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Printing {

    @SneakyThrows
    public static void printValue(List<Exercise> exercises) {
        for (Exercise exe: exercises) {
            System.out.println(exe.getA()+"\t\t"+exe.getOperation().getOperator()+"\t\t"+ exe.getB()+"\t\t=\t"+exe.getAnswer());

            }
        }
}