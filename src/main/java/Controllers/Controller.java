package Controllers;

import Services.CalculateDay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {



    @GetMapping("/erdetfredag")
    public String erdetfredag() {
        int day = CalculateDay.calculateDay();
        if (day==5){
            return "I dag er det fredag!";
        }
        else{
            return "Det er ikke fredag i dag";
        }
    }

}
