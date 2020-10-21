package design_pattern.homework.my_enum;

import design_pattern.homework.my_enum.service.*;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.Arrays;

@RequiredArgsConstructor
@Getter
public enum Operation {
     MULTIPLICATION("*", new MultiplicationHandler()), DIVISION("/", new DivisionHandler()),
     SUBTRACTION("-", new SubstractionHandler()), ADDITION("+", new AditionHandler());


     private final String operator;
     private final HttpHandler handler;

     @SneakyThrows
     public static Operation getOperation(String oper){
        return   Arrays.stream(values())
                  .filter(o->oper.equals(o.operator))
                  .findAny()
                  .orElseThrow(()->new IllegalArgumentException(" Operator Not Found. Plese, try again"));
     }

}
