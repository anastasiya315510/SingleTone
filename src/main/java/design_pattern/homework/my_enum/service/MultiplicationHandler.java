package design_pattern.homework.my_enum.service;

import design_pattern.homework.dto.Exercise;
import design_pattern.homework.genarate_val.RandomNumbersGenarator;
import design_pattern.homework.my_enum.Operation;

public class MultiplicationHandler implements HttpHandler {
    @Override
    public Exercise genarateExercise() {
        double a = RandomNumbersGenarator.randomIntsGenerator(0,10);
        double b = RandomNumbersGenarator.randomIntsGenerator(0,10);
        double answer = a*b;

        return Exercise.builder()
                .a(a)
                .operation(Operation.MULTIPLICATION)
                .b(b)
                .answer(answer)
                .build();
    }
}
