package com.example.classloader;

import org.junit.Test;

import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReference;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ModuleFinderTest {

  @Test
  public void testFindModule() throws Exception {
    final ModuleFinder moduleFinder = ModuleTestSupport.getModuleFinder();
    assertTrue(moduleFinder.find(ModuleTestSupport.MODULE_NAME).isPresent());
    final Set<ModuleReference> allModules = moduleFinder.findAll();
    assertEquals(4, allModules.size());
  }
}
