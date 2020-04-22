/**
 * 
 */
package manager;

import dataProvider.ConfigFileReader;

/**
 * @author Sourav Das
 *
 */
public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader  configFileReader;
	
	public FileReaderManager() {
		
	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}


	public static ConfigFileReader getConfigFileReader() {
		return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
	}


//	@SuppressWarnings("static-access")
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		FileReaderManager f = new FileReaderManager();
//		
//		System.out.println(f.getConfigFileReader().getApplicationUrl());
//
//	}

}
