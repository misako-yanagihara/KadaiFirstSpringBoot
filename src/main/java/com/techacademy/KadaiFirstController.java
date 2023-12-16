package com.techacademy;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController

public class KadaiFirstController {
    @GetMapping("/dayofweek/{day}")
    public String dispDayOfWeek(@PathVariable String day) {

        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
            Date date = inputFormat.parse(day);
            SimpleDateFormat outputFormat = new SimpleDateFormat("EEEE");

            String dayOfWeek = outputFormat.format(date);
            return dayOfWeek;
        }
        catch(ParseException e) {
            e.printStackTrace();
        }
        return day;

        }

@GetMapping("/plus/{val1}/{val2}")
public String calcPlus(@PathVariable int val1,@PathVariable int val2) {
    int res1 = 0;
    res1 = val1 + val2;
    return "実行結果:" + res1;

    }

@GetMapping("/minus/{val1}/{val2}")
public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
    int res2 = 0;
    res2 = val1 - val2;
    return "実行結果:" + res2;
}

@GetMapping("/times/{val1}/{val2}")
public String calcTimes(@PathVariable int val1,@PathVariable int val2) {
    int res3 = 0;
    res3 = val1 * val2;
    return "実行結果:" + res3;

}

@GetMapping("/divide/{val1}/{val2}")
public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
    int res4 = 0;
    res4 = val1 / val2;
    return "実行結果:" + res4;

}

}
