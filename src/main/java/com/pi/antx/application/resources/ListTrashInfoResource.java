package com.pi.antx.application.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListTrashInfoResource {
    @GetMapping("/antx/trashes/{userID}")
    static String getUserTrashesInfo(@PathVariable("userID") final String userID) {
        return "It's working and the user ID is: " + userID;
    }
}
