package configFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;





public class ImportConfigFile {
	File src;
	FileInputStream fis;
	Properties po;
	String value;
	
public ImportConfigFile(String path) {
	
	src=new File(path);
	try {
		fis=new FileInputStream(src);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	po=new Properties();
	try {
		po.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public String getConfigData(String key) {
	String a=po.getProperty(key);
	return a;
	
}



}
