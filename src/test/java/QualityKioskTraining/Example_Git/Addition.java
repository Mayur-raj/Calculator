package QualityKioskTraining.Example_Git;

import org.junit.Assert;
import org.junit.Test;

public class Addition {
	@Test
	public void TestAdditionWithPositiveNumbers() {
		
        CalculatorAPI obj=new CalculatorAPI();
		int Result = obj.Addition(10,20);
		Assert.assertEquals(Result, 30);
		
	}
	@Test
    public void TestAdditionWithNegativeNumbers() {
		
        CalculatorAPI obj1=new CalculatorAPI();
		int Result = obj1.Addition(-10,-20);
		Assert.assertEquals(Result, -30);
		
	}
	@Test
   public void TestAdditionWithNumbers() {
		
        CalculatorAPI obj=new CalculatorAPI();
		int Result = obj.Addition(-10,20);
		Assert.assertEquals(Result, 10);
		
	}

}
