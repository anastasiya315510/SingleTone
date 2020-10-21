package design_pattern.homework;

import design_pattern.homework.dto.Exercise;
import design_pattern.homework.my_enum.service.*;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Examenator {
    List<Exercise> exercises;
    public List<Exercise> getExercises(int amount){
        List<Supplier<HttpHandler>>handler =asList(AditionHandler::new, DivisionHandler::new, SubstractionHandler::new,
                 MultiplicationHandler::new);

        return  Stream.generate(handler.get(1))
               .limit(amount)
                .map(HttpHandler::genarateExercise)
               .collect(Collectors.toList());
    }
}
