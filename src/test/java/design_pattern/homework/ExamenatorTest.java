package design_pattern.homework;

import design_pattern.homework.dto.Exercise;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ExamenatorTest {
   @Test
   public void getExercise(){
       Examenator examenator = new Examenator();
       List<Exercise> exercises = examenator.getExercises(10);
       Assert.assertEquals(10, exercises.size());


   }

}