package com.framework.king.annotations;

import com.framework.king.configuration.TracingAspectConfiguration;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(TracingAspectConfiguration.class)
public @interface EnableTracingAspect { }
