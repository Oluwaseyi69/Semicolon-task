import Assignment.ChapterThree.CommissionCalculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CommissionCalculatorTest {
    @Test
    public void testForSalesOfItemsPerPerson(){
     CommissionCalculator commissionCalculator = new CommissionCalculator();
        commissionCalculator.itemSold(5000);
        double answer = commissionCalculator.getCommission(5650);
        Assertions.assertEquals(5650,answer);
    }
    @Test
    public void testTheSecondItemsSold(){
        CommissionCalculator commissionCalculator = new CommissionCalculator();
        commissionCalculator.itemSold(233.99);
        double answer = commissionCalculator.getCommission(461.9851);
        Assertions.assertEquals(461.9851,answer);
    }
}
