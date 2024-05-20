//package com.techpixe.validation;

package com.techpixe.entity;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = MobileNumberValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMobileNumber {
	String message() default "Mobile number must contain exactly 10 digits";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
