package com.sap.junit.rules;

import java.io.File;

public class DigitalAssetManager {

	private File icon;
	private File assets;
	
	public DigitalAssetManager(File icon, File assets){
		if(icon == null || !icon.exists() || !icon.isFile()){
			throw new IllegalArgumentException("Icon is null, not a file, or doesn't exist.");
		} 
		if(icon == assets || !assets.exists() || !assets.isDirectory()){
			throw new IllegalArgumentException("Assets is null, not a directory, or doesn't exist.");
		}
		this.icon = icon;
		this.assets = assets;
	}
	
	public int getAssetCount(){
		return assets.list().length; 
	}
}