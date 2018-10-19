package pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericlibrary.propertyHelper;
import genericlibrary.testbase;
import objectRepository.OR_FileUpload;

public class FileUploader extends testbase{
	
	@Test
	public void uploadFile() throws Exception{
		
	propertyHelper ph = new propertyHelper();
	
	LaunchBrowser("chrome");
	driver.get(ph.getValues("File_Upload"));
	
	OR_FileUpload objrep = PageFactory.initElements(driver, OR_FileUpload.class);
	performClick(objrep.chooseFile);
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\RAJAT\\workspace\\AutoIT\\FileUpload.exe");
	Thread.sleep(2000);
	System.out.println("Before upload button");
	performClick(objrep.UploadButton);
	
	}
}
