package script;

import org.testng.annotations.Test;

import genricLib.Baseclass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends Baseclass {
	@Test
	public void tc1()
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		SkillraryDemoLoginPage sd= new SkillraryDemoLoginPage(driver);
		driverutilies.switchtabs(driver);
		driverutilies.mouseHover(driver, sd.getCoursebtn());
		sd.seleniumtraining();
		
		AddtocartPage a=new AddtocartPage(driver);
		driverutilies.doubleclick(driver, a.getAddbtn());
		a.addtocartbtn();
		driverutilies.alertpopup(driver);
		
	}
	

}
