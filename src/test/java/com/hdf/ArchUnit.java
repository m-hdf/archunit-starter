package com.hdf;

import com.hdf.rules.PackageNaming;
import com.hdf.rules.AnnotationNaming;
import com.hdf.rules.CodingRules;
import com.hdf.rules.CycleDependency;
import com.hdf.rules.LayeredArchitecture;
import com.hdf.rules.PackageUsage;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchTests;

public class ArchUnit {

  @ArchTest
  static final ArchTests annotationNaming = ArchTests.in(AnnotationNaming.class);

  @ArchTest
  static final ArchTests cycleDependency = ArchTests.in(CycleDependency.class);

  @ArchTest
  static final ArchTests layeredArchitecture = ArchTests.in(LayeredArchitecture.class);

  @ArchTest
  static final ArchTests packageNaming = ArchTests.in(PackageNaming.class);

  @ArchTest
  static final ArchTests packageUsage = ArchTests.in(PackageUsage.class);

  @ArchTest
  static final ArchTests codingRules = ArchTests.in(CodingRules.class);
}
