package com.project.UnitConvertor.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class unitController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/length")
    public String showPage(){
        return "length";
    }

    @PostMapping("/length")
    public  String convert(
        @RequestParam double value,
        @RequestParam String from,
        @RequestParam String to,
        Model model){
        double result = convertLength(value, from, to);

        model.addAttribute("result", result);
        return  "length";

    }

    private double convertLength(double value, String from, String to){
        if(from.equals("km")) value *= 1000;
        if(from.equals("cm")) value /= 100;

        if(to.equals("km")) return  value / 1000;
        if(to.equals("cm")) return  value * 100;

        return value;
    }

    @GetMapping("/weight")
    public String showWeightPage() {
        return "weight";
    }



    @PostMapping("/weight")
    public String convertWeight(
            @RequestParam double value,
            @RequestParam String from,
            @RequestParam String to,
            Model model) {

        double result = convertWeightLogic(value, from, to);

        model.addAttribute("result", result);
        return "weight";
    }

    private double convertWeightLogic(double value, String from, String to) {

        // Convert everything to grams
        if(from.equals("kg")) value *= 1000;
        if(from.equals("mg")) value /= 1000;
        if(from.equals("lb")) value *= 453.592;

        // Convert grams to target
        if(to.equals("kg")) return value / 1000;
        if(to.equals("mg")) return value * 1000;
        if(to.equals("lb")) return value / 453.592;

        return value; // grams
    }

    @GetMapping("/temperature")
    public String showTempPage() {
        return "temperature";
    }

    @PostMapping("/temperature")
    public String convertTemp(
            @RequestParam double value,
            @RequestParam String from,
            @RequestParam String to,
            Model model) {

        double result = convertTemperature(value, from, to);

        model.addAttribute("result", result);
        return "temperature";
    }

    private double convertTemperature(double value, String from, String to) {

        if(from.equals(to)) return value;

        // Convert everything to Celsius first
        if(from.equals("F")) value = (value - 32) * 5/9;
        if(from.equals("K")) value = value - 273.15;

        // Convert Celsius to target
        if(to.equals("F")) return (value * 9/5) + 32;
        if(to.equals("K")) return value + 273.15;

        return value; // Celsius
    }
}
