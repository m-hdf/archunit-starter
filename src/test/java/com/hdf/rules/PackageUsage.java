package com.hdf.rules;

import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

public class PackageUsage {

  @ArchTest
  static final ArchRule servicesOnlyUsedInController = ArchRuleDefinition.classes()
      .that().resideInAPackage("..service..")
      .should().onlyBeAccessed().byAnyPackage("..controller..", "..service..");

  @ArchTest
  static final ArchRule repositoriesOnlyUsedInService = ArchRuleDefinition.classes()
      .that().resideInAPackage("..repository..")
      .should().onlyBeAccessed().byAnyPackage("..service..", "..repository..");

  @ArchTest
  static final ArchRule dtoOnlyUsedInController = ArchRuleDefinition.classes()
      .that().resideInAPackage("..dto..")
      .should().onlyBeAccessed().byAnyPackage("..controller..", "..dto..");
}
