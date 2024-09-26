package com.hdf.rules;

import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;

public class CycleDependency {

  @ArchTest
  static final ArchRule cycleDependencyCheck = SlicesRuleDefinition.slices()
      .matching("(*)..").should().beFreeOfCycles();
}
