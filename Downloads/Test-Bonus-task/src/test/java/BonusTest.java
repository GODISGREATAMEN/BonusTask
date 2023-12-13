import org.example.app.service.BonusService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BonusTest {

    @Test
    void testExpectedCalculation() {
        BonusService bonusService = new BonusService();
        double sales = 1000.0;

        String result = bonusService.getRes(sales);
        assertEquals("10.0", result);
    }

    @Test
    void testUnexpectedCalculation() {
        BonusService bonusService = new BonusService();
        double sales = 500.0;

        String result = bonusService.getRes(sales);
        assertNotEquals("0.00", result);
    }
}
