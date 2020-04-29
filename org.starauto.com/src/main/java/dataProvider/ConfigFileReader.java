package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "configs//Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Properties file not found at path : " + propertyFilePath);
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException(
					"Driver Path not specified in the Configuration.properties file for the Key:driverPath");
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitWait");
		if (implicitlyWait != null) {
			try {
				return Long.parseLong(implicitlyWait);
			} catch (NumberFormatException e) {
				throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
			}
		}
		return 30;
	}

	public String getApplicationUrl() {
		String webUrl = properties.getProperty("webUrl");
		if (webUrl != null)
			return webUrl;
		else
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:webUrl");
	}
	
	public String getRemoteHubURL() {
		String remoteHubURL = properties.getProperty("remoteHubURL");
		if (remoteHubURL != null)
			return remoteHubURL;
		else
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:remoteHubURL");
	}

	public String getServiceUrl() {
		String serviceUrl = properties.getProperty("serviceUrl");
		if (serviceUrl != null)
			return serviceUrl;
		else
			throw new RuntimeException(
					"Service Url not specified in the Configuration.properties file for the Key:serviceUrl");
	}

	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}

	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}

	public Boolean getBrowserDeleteCookies() {
		String deleteCookies = properties.getProperty("deleteCookies");
		if (deleteCookies != null)
			return Boolean.valueOf(deleteCookies);
		return true;
	}

// To test the values uncomment the main method
//	public static void main(String[] args) {
//		
//		ConfigFileReader conf = new ConfigFileReader();
//		System.out.println(conf.getApplicationUrl());
//		
//	}
}
