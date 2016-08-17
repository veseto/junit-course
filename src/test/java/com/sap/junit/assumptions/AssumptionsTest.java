package com.sap.junit.assumptions;

import java.io.File;

import static org.junit.Assume.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class AssumptionsTest {
	@Test public void filenameIncludesUsername() {
        assumeThat(File.separatorChar, is('/'));
        assertThat(new User("optimus").configFileName(), is("configfiles/optimus.cfg"));
        //assumeThat(File.separatorChar, is('\\'));
        //assertThat(new User("optimus").configFileName(), is("configfiles\\optimus.cfg"));
    }
}