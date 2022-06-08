import com.example.test.SalaryService;
import org.junit.Assert;
import org.junit.Test;

public class SalaryServiceTest {

	@Test
	public void shouldCalculateSalaryWhenUnderLimit() {
		SalaryService salaryService = new SalaryService();
		int actual = salaryService.calculateSalary(10);
		int expected = 0;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void shouldCalculateSalaryWhenEqualLimit() {
		SalaryService salaryService = new SalaryService();
		int actual = salaryService.calculateSalary(200);
		int expected = 10;

		Assert.assertEquals(expected, actual);
	}
}
