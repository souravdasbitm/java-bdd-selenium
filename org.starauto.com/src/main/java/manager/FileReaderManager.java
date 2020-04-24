/**
 * 
 */
package manager;

import dataProvider.ConfigFileReader;
import dataProvider.MicrosoftDocument;

/**
 * @author Sourav Das
 *
 */
public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static MicrosoftDocument microsoftDocument;

	public FileReaderManager() {

	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigFileReader() {
		return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
	}

	public MicrosoftDocument getMicrosoftDocument() {
		return (microsoftDocument == null) ? microsoftDocument = new MicrosoftDocument() : microsoftDocument;
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
