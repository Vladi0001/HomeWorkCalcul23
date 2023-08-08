package homeworkcolcul23.homeworkcolcul23.Controller;

import homeworkcolcul23.homeworkcolcul23.Service.ColculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colculator")
public class ColculaterController {
    private final ColculatorService colculatorService;

    public ColculaterController(ColculatorService colculatorService) {
        this.colculatorService = colculatorService;
    }

    @GetMapping
    public String greeting() {
        return "Добро пожаловать!";
    }

    @GetMapping("/plus")
        public String plus (@RequestParam int num1, @RequestParam int num2) {
            int result = colculatorService.sum(num1, num2);
            return num1 + " + " + num2 + " = " + result;
        }

    @GetMapping("/minus")
    public String minus (@RequestParam int num1, @RequestParam int num2) {
        int result = colculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }
    @GetMapping("/multiply")
    public String multiply (@RequestParam int num1, @RequestParam int num2) {
        int result = colculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/divid")
    public String divid (@RequestParam int num1, @RequestParam int num2) {
        int result = colculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }


}
