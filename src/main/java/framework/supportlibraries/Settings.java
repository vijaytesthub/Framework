/**
 *
 */
package framework.supportlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import framework.utils.FrameworkException;
import framework.utils.FrameworkUtils;;


/**
 * @author vijayakarthikeyanarul
 *
 */

public class Settings {

	public static Properties properties = loadProperties();



	// This java file is to load all the properties files in the FW project

private Settings() {
	// TODO Auto-generated constructor stub
}

/**
 * Function to return the singleton instance of the {@link Properties}
 * object
 *
 * @return Instance of the {@link Properties} object
 */
public static Properties getInstance() {
	return properties;
}

private static Properties loadProperties() {

	Properties properties = new Properties();

	System.out.println(System.getProperty("user.dir") + FrameworkUtils.getFileSeparator()+"resource"+ FrameworkUtils.getFileSeparator()+"settings.properties");
	try {
		properties.load(new FileInputStream(System.getProperty("user.dir") + FrameworkUtils.getFileSeparator()+"resource"+ FrameworkUtils.getFileSeparator()+"settings.properties"));


	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new FrameworkException(
				"FileNotFoundException while loading the Settings file");
	} catch (IOException e) {
		e.printStackTrace();
		throw new FrameworkException(
				"IOException while loading the  Settings file");
	}
	return properties;

}
}
