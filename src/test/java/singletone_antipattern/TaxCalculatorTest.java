package singletone_antipattern;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class TaxCalculatorTest {


    @Test
    public void withNds(){
        NdsResolver mock = Mockito.mock(NdsResolver.class);
        Mockito.when(mock.getNds()).thenReturn(0.2);

        TaxCalculator taxCalculator = new TaxCalculator(mock);
        double answer = taxCalculator.withNds(100);
        Assert.assertEquals(120, answer, 0.0001);

    }

}