package com.sap.junit.assumptions;

import java.io.File;

public class User {

	private String cfg;
	
	public User(String cfg){
		this.cfg = cfg;
	}
	
	public String configFileName(){
		return "configfiles" + File.separatorChar + cfg + ".cfg";
	}
}
