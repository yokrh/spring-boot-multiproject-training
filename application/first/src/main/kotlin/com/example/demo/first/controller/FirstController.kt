package com.example.demo.first.controller

import com.example.demo.first.service.FirstService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstController(
    private val firstService: FirstService
) {

    @GetMapping("/v1/first/hello")
    fun hello(): ResponseEntity<String> {
        val body = firstService.hello()
        return ResponseEntity.ok().body(body)
    }
}