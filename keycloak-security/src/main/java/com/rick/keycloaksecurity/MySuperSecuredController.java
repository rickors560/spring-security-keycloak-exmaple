package com.rick.keycloaksecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ritik.sharma
 * @created : 27-05-2023
 */
@RequestMapping("/secured")
@RestController
public class MySuperSecuredController {

    @GetMapping("/get-data")
    public String get(){
        return "SUPER SECURED DATA";
    }

}