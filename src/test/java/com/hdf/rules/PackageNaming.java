package com.hdf.rules;

import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

public class PackageNaming {

  @ArchTest
  static final ArchRule controllerPackageNaming = ArchRuleDefinition.classes()
      .that().resideInAPackage("..controller..")
      .should().haveSimpleNameEndingWith("Controller");

  @ArchTest
  static final ArchRule servicePackageNaming = ArchRuleDefinition.classes()
      .that().resideInAPackage("..service..")
      .should().haveSimpleNameEndingWith("Service")
      .orShould().haveSimpleNameEndingWith("ServiceImpl");

  @ArchTest
  static final ArchRule repositoryPackageNaming = ArchRuleDefinition.classes()
      .that().resideInAPackage("..repository..")
      .should().haveSimpleNameEndingWith("Repository")
      .orShould().haveSimpleNameEndingWith("RepositoryImpl");

  @ArchTest
  static final ArchRule configurationPackageNaming = ArchRuleDefinition.classes()
      .that().resideInAPackage("..configuration..")
      .should().haveSimpleNameEndingWith("Configuration");

  @ArchTest
  static final ArchRule dtoPackageNaming = ArchRuleDefinition.classes()
      .that().resideInAPackage("..dto..")
      .should().haveSimpleNameEndingWith("Dto");
}
