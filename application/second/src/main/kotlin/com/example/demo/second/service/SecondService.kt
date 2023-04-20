package com.example.demo.second.service

import com.example.demo.common.service.CommonService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class SecondService(
    private val commonService: CommonService
) {

    @Value("\${tmp.prop}")
    private val prop: String = ""

    fun hello(): String {
        return commonService.hello("second") + " | $prop"
    }
}