package com.SkillAssure.HappytripSolution.Automation.TestClass;
import org.testng.annotations.Test;


public class TestSignIn extends BaseTest{
	public void signInWithValidCredentials(String userName,String password)
	  {
	   driver.get("http://219.65.96.171:8085/happytripbugs1/home.html");
	  }
	@DataProvider(name="signIn")
	public Object[][] getCredentials() {
	return new Object[][] {
	{"admin@mindtree.com","admin"}
	   };
	}
	
	
	
	
	public void signInWithInvalidCredentials(String userName,String password)
	{
		
	}
	public void signInWithoutCredentials()

}
