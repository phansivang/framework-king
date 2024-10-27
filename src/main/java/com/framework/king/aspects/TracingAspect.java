package com.framework.king.aspects;

import brave.Span;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import brave.Tracer;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class TracingAspect {

    private final Tracer tracer;

    @AfterThrowing(throwing = "exception")
    public void addTagAfterThrowingException(Exception exception) {
        Span currentSpan = trace();
        if (currentSpan != null) {
            currentSpan.tag("error", exception.getMessage());
        }
    }

    private Span trace() {
        return tracer.currentSpan();
    }
}
