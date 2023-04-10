package in.arpitgadle.services;

import org.springframework.stereotype.Service;

@Service
public class SummationServiceImpl
    implements SummationService{

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
