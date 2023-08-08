package homeworkcolcul23.homeworkcolcul23.Service;

import homeworkcolcul23.homeworkcolcul23.Exception.ZeroDevideException;
import org.springframework.stereotype.Service;

@Service
public class ColculatorServiceImpl implements ColculatorService {
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ZeroDevideException();
        }
        return num1 / num2;
    }
}
