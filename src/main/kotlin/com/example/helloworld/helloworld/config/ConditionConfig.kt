package com.example.helloworld.helloworld.config

import com.example.helloworld.helloworld.condition.MagicCondition
import com.example.helloworld.helloworld.service.impl.MagicServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Conditional
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.example.helloworld.helloworld.bean"])
class ConditionConfig {

    @Bean
    @Conditional(MagicCondition::class)
    fun magiceSErvice(): MagicServiceImpl {
        return MagicServiceImpl()
    }


}