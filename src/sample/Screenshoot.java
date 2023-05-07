package sample;

import java.io.File;
import java.nio.file.Files;

public class Screenshoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=((TakeScreenshot)driver).getScreenshotAs(OutputType.File);
		Files.copy(f, new File("c:\\users\\sample.png"));
	}

}
