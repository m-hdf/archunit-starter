package com.hdf.rules;

import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.DependencyRules;
import com.tngtech.archunit.library.GeneralCodingRules;

public class CodingRules {

  @ArchTest
  static final ArchRule noGenericExceptions = GeneralCodingRules.NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS;

  @ArchTest
  static final ArchRule noJavaUtilLogging = GeneralCodingRules.NO_CLASSES_SHOULD_USE_JAVA_UTIL_LOGGING;

  @ArchTest
  static final ArchRule noJavaJodaTime = GeneralCodingRules.NO_CLASSES_SHOULD_USE_JODATIME;

  @ArchTest
  static final ArchRule noJavaStandardStreams = GeneralCodingRules.NO_CLASSES_SHOULD_ACCESS_STANDARD_STREAMS;

  @ArchTest
  static final ArchRule noFieldInjection = GeneralCodingRules.NO_CLASSES_SHOULD_USE_FIELD_INJECTION;

  @ArchTest
  static final ArchRule noDeprecatedApi = GeneralCodingRules.DEPRECATED_API_SHOULD_NOT_BE_USED;

  @ArchTest
  static final ArchRule noUpperDependency = DependencyRules.NO_CLASSES_SHOULD_DEPEND_UPPER_PACKAGES;
}
