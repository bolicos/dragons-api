package br.bolicos.api.dragons.application.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Component
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepositoryImpl {

    /**
     * Alias for {@link Component#value}.
     */
    @AliasFor(annotation = Component.class)
    String value() default "";
}
