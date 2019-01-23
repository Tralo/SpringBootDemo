package com.example.helloworld.helloworld.config

import com.example.helloworld.helloworld.condition.MagicCondition
import com.example.helloworld.helloworld.service.MagicServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Conditional
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.example.helloworld.helloworld"])
class ConditionConfig {

    @Bean
    @Conditional(MagicCondition::class)    // 注意:   application.getBean()中传输的字符串与方法名相对应   magiceService
    fun magiceService(): MagicServiceImpl {
        return MagicServiceImpl()
    }


}