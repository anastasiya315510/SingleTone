package design_pattern.homework.my_enum.service;

import design_pattern.homework.dto.Exercise;
import design_pattern.homework.genarate_val.RandomNumbersGenarator;
import design_pattern.homework.my_enum.Operation;

public class AditionHandler implements HttpHandler {
    @Override
    public Exercise genarateExercise() {
        double a = RandomNumbersGenarator.randomIntsGenerator(0,10);
        double b = RandomNumbersGenarator.randomIntsGenerator(0,10);

        return Exercise.builder()
                .a(a)
                .operation(Operation.ADDITION)
                .b(b)
                .answer(a+b)
                .build();
    }
}
