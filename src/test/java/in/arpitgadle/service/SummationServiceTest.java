package in.arpitgadle.service;

import in.arpitgadle.services.SummationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SummationServiceTest {

    @Autowired
    SummationService summationService;

    @Test
    void testSummation()
    {
        int a=10;
        int b=20;
        assertEquals(30,summationService.sum(a,b));
    }
}
