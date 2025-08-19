package sikulidesktoptool;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
	Screen s=new Screen();
  @Test
  public void desktop() throws FindFailed {
	  s.click("D:\\lib\\sikulipictures\\Window.PNG");
	  s.click("D:\\lib\\sikulipictures\\Wi.PNG");
	  s.type("D:\\lib\\sikulipictures\\Search.PNG", "chrome");
  }
}
