package Controllers;

import Services.CalculateDay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {


    //Her kaldes calculateDay-metoden, og afhængigt af, hvad denne metode returnerer, returneres en besked, der
    // fortæller brugeren, om det er fredag.
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
