package com.hdf.rules;

import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

public class AnnotationNaming {

  @ArchTest
  static final ArchRule controllerAnnotationNaming = ArchRuleDefinition.classes()
      .that().areAnnotatedWith(Controller.class)
      .and().areAnnotatedWith(RestController.class)
      .and().areAnnotatedWith(ControllerAdvice.class)
      .should().haveSimpleNameEndingWith("Controller");

  @ArchTest
  static final ArchRule controllerNamingAnnotation = ArchRuleDefinition.classes()
      .that().haveSimpleNameEndingWith("Controller")
      .should().beAnnotatedWith(Controller.class)
      .orShould().beAnnotatedWith(RestController.class)
      .orShould().beAnnotatedWith(ControllerAdvice.class);

  @ArchTest
  static final ArchRule serviceAnnotationNaming = ArchRuleDefinition.classes()
      .that().areAnnotatedWith(Service.class)
      .should().haveSimpleNameEndingWith("ServiceImpl");

  @ArchTest
  static final ArchRule serviceNamingAnnotation = ArchRuleDefinition.classes()
      .that().haveSimpleNameEndingWith("ServiceImpl")
      .should().beAnnotatedWith(Service.class);

  @ArchTest
  static final ArchRule repositoryAnnotationNaming = ArchRuleDefinition.classes()
      .that().areAnnotatedWith(Repository.class)
      .should().haveSimpleNameEndingWith("Repository")
      .orShould().haveSimpleNameEndingWith("RepositoryImpl");

  @ArchTest
  static final ArchRule repositoryNamingAnnotation = ArchRuleDefinition.classes()
      .that().haveSimpleNameEndingWith("RepositoryImpl")
      .or().haveSimpleNameEndingWith("Repository")
      .should().beAnnotatedWith(Repository.class);

  @ArchTest
  static final ArchRule configurationAnnotationNaming = ArchRuleDefinition.classes()
      .that().areAnnotatedWith(Configuration.class)
      .should().haveSimpleNameEndingWith("Configuration");

  @ArchTest
  static final ArchRule configurationNamingAnnotation = ArchRuleDefinition.classes()
      .that().haveSimpleNameEndingWith("Configuration")
      .should().beAnnotatedWith(Configuration.class);
}
