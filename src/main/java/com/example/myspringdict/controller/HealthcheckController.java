package com.example.myspringdict.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import java.util.HashMap;

import java.time.ZonedDateTime;

@RestController
class HealthcheckController {

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody HashMap<String, Object> healthcheck(@RequestParam("format") String format) {
        HashMap<String, Object> map = new HashMap<>();
        if (format == "short") {
            map.put("status", LOGIN);
        } else if (format == "full") {
            map.put("currentTime", zt);
            map.put("sttaus", LOGIN);
        } else {
            map.put(status, BAD_REQUEST);
        }

        return map;
    }

    @PutMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody HashMap<String, Object> healthcheckPut() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", NOT_ALLOWD);
        return map;
    }

    @PostMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody HashMap<String, Object> healthcheckPost() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", NOT_ALLOWD);
        return map;
    }


    @DeleteMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody HashMap<String, Object> healthcheckDelete() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", NOT_ALLOWD);
        return map;
    }

    public static final int NOT_ALLOWD = 405;
    public static final int BAD_REQUEST = 400;
    public static final String LOGIN = "OK";
    public static final ZonedDateTime zt = ZonedDateTime.now();
}


