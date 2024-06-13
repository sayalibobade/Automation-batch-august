package robot_class;

import java.awt.AWTException;

import dynamic_code.File_upload_dynamic;

public class Uploadfile_dynamic extends File_upload_dynamic {

	public static void main(String[] args) throws AWTException {
		launch_Browser("chrome");
		urlhit("https://www.ilovepdf.com/pdf_to_word");
		
		upload_file("//span[text()=\"Select PDF file\"]", "file:///E:/SAYLI/Manual-Testing-Step-by-Step-Tutorial.pdf");

	}

}
