package com.framework.king.configuration;

import brave.Tracer;
import com.framework.king.component.TracingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TracingAspectConfiguration {

    @Bean
    public TracingAspect tracingAspect(Tracer tracer) {
        return new TracingAspect(tracer);
    }
}
