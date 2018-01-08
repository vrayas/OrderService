package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class PropertiesReaderHelper {
	
	String result = "";
	InputStream inputStream ;
	private boolean mSourceFile;
	private String mInputFileName;
	private String mOutputFileLocation;
	Properties prop;
	static private PropertiesReaderHelper _instance =  null;
	
	public PropertiesReaderHelper()  {
		
	try {
		prop = new Properties();
		String propFileName = "orderconfig.properties";

		inputStream = getClass().getResourceAsStream(propFileName);

		if (inputStream != null) {
			prop.load(inputStream);
			setSourceFile(Boolean.parseBoolean(prop.getProperty("data.read.source.file")));
			setInputFileName(prop.getProperty("input.file.name"));
			setOutputFileName(prop.getProperty("output.file.location"));
		} else {
			throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
		}
	} catch (Exception e) {
		System.out.println("Exception: " + e);
	} finally {
		try {
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	

	/**
	 * @return the mInputFileName
	 */
	public String getInputFileName() {
		return mInputFileName;
	}

	/**
	 * @param mInputFileName the mInputFileName to set
	 */
	public void setInputFileName(String mInputFileName) {
		this.mInputFileName = mInputFileName;
	}

	/**
	 * @return the mOutputFileName
	 */
	public String getOutputFileName() {
		return mOutputFileLocation;
	}

	/**
	 * @param mOutputFileName the mOutputFileName to set
	 */
	public void setOutputFileName(String mOutputFileLocation) {
		this.mOutputFileLocation = mOutputFileLocation;
	}

	/**
	 * @return the _instance
	 */
	public static PropertiesReaderHelper getInstance() {
		  if(_instance == null){
	            _instance = new PropertiesReaderHelper();
	        }
	        return _instance;
	}

	/**
	 * @param _instance the _instance to set
	 */
	public static void setInstance(PropertiesReaderHelper _instance) {
		PropertiesReaderHelper._instance = _instance;
	}



	/**
	 * @return the mSource
	 */
	public boolean isSourceFile() {
		return mSourceFile;
	}



	/**
	 * @param mSource the mSource to set
	 */
	public void setSourceFile(boolean mSource) {
		this.mSourceFile = mSource;
	}

}

