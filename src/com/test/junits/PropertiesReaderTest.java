package com.test.junits;


import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

import com.test.PropertiesReaderHelper;

import org.junit.Assert;
import junit.framework.TestCase;

public class PropertiesReaderTest extends TestCase{
	PropertiesReaderHelper testProps;

	@Before
	public void setUp() throws Exception {
		 testProps = new PropertiesReaderHelper();
	}

	@Test
	public void testGetSource() {
		 Assert.assertTrue(testProps.isSourceFile());
	}

	@Test
	public void testGetInputFileName() {
		 Assert.assertEquals("C:\\Users\\LALITA\\Downloads\\sample_data_ordered.txt", testProps.getInputFileName());
	}

	@Test
	public void testGetOutputFileName() {
		 Assert.assertEquals("C:\\Users\\LALITA\\Downloads", testProps.getOutputFileName());
	}
}
