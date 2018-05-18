package testNGexamples;

import org.testng.annotations.Test;

public class TestNGexample01 {
  @Test(priority = 3)
  public void test2() {
	  System.out.println("test 2");
  }
  
  @Test(priority = 2)
  public void test1() {
	  System.out.println("test 1");
  }
  
  @Test(priority = 1, enabled = false)
  public void test3() {
	  System.out.println("test 3");
  }
}
