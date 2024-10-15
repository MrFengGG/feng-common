package com.feng.common.utils.validate;

import com.feng.common.utils.exception.BusinessException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;

import java.util.Optional;
import java.util.Set;

/**
 * 校验工具类
 */
public class ValidationUtil {
    private static final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

    public static <T> void validate(T t) {
        Set<ConstraintViolation<T>> validateSet = validatorFactory.getValidator().validate(t);
        Optional<ConstraintViolation<T>> constraintViolation = validateSet.stream().findFirst();
        constraintViolation.ifPresent(violation -> {
            throw new BusinessException(violation.getMessage());
        });
    }
}
