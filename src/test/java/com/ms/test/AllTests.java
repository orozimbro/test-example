package com.ms.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ms.test.aritmetic.RetanguloParametrizedTest;
import com.ms.test.aritmetic.RetanguloTest;
import com.ms.test.pilha.PilhaTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	RetanguloTest.class, 
	PilhaTest.class,
	RetanguloParametrizedTest.class
})
public class AllTests {

}
