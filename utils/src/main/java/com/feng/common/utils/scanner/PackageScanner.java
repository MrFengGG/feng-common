package com.feng.common.utils.scanner;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: 冯子玉
 * @Desctription: 包掃描工具
 * @Date: Created in 2024/10/16 0:02
 * @Version: 1.0
 */
public interface PackageScanner {
    List<String> scan(String basePackage) throws IOException;

    List<String> scan(String basePackage, Predicate<String> filter) throws IOException;

    <T extends Annotation> List<T> scanAndGetAnnotations(Class<T> tClass, String basePackage) throws IOException, ClassNotFoundException;

    <T extends Annotation> List<T> scanAndGetAnnotations(Class<T> tClass, String basePackage, Predicate<String> filter) throws IOException, ClassNotFoundException;
}
