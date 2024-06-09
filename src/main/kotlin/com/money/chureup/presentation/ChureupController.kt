package com.money.chureup.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ChureupController {
    @GetMapping("/test")
    fun test() : String{
        return "test";
    }
}