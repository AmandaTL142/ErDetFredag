package Controllers;

import Services.CalculateDay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {


    //Her kaldes calculateDay-metoden, og afhængig af, hvad der returneres, returneres her en besked, der foræltter,
    // om det er fredag.
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
