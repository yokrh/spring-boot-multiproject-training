package com.example.demo.first.service

import com.example.demo.common.service.CommonService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class FirstService (
    private val commonService: CommonService
) {

    @Value("\${tmp.prop}")
    private val prop: String = ""

    fun hello(): String {
        return commonService.hello("first") + " | $prop"
    }
}