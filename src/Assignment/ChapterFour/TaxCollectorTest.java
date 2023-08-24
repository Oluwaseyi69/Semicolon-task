package Assignment.ChapterFour;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TaxCollectorTest {
    @Test
    public void testForTotalTaxForFirstCitizen(){
        TaxCollector taxCollector = new TaxCollector();
        taxCollector.totalTax(51_000);
        double total = taxCollector.getTaxCollector(10_200);
        Assertions.assertEquals(10_200,total);
    }
    @Test
    public void testForTotalTaxForSecondCitizen(){
        TaxCollector taxCollector = new TaxCollector();
        taxCollector.totalTax(20_000);
        double total = taxCollector.getTaxCollector(4_000);
        Assertions.assertEquals(4_000, total);

    }
}
