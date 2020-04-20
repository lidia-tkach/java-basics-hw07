import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class SumAverageTest {

  @DataProvider(name = "Sum")
  public static Object[][] sum() {
    return new Object[][]{
            {1, 100, 5050},
            {-100, 100, 0},
            {1, 1, 1},
            {50, 60, 605},
            {1, 10, 55}
    };
  }

  @DataProvider(name = "Average")
  public static Object[][] average() {
    return new Object[][]{
            {1, 100, 50.5},
            {-100, 100, 0.0},
            {1, 1, 1.0},
            {333, 777, 555.0},
            {-40, -20, -30.0}
    };
  }

  @Test(dataProvider = "Sum")
  public void testSumArray(int lowerBound, int upperBound, int expectedResult) {
    int actualResult = SumAverage.sum(lowerBound, upperBound);

    assertEquals(actualResult, expectedResult, "Sum is not correct");
  }

  @Test(dataProvider = "Sum")
  public void testSum1(int lowerBound, int upperBound, int expectedResult) {
    int[] numbers = IntStream.range(lowerBound, upperBound + 1).toArray();
    int actualResult = SumAverage.sum(numbers);

    assertEquals(actualResult, expectedResult, "Sum is not correct");
  }

  @Test(dataProvider = "Average")
  public void testAverage(int lowerBound, int upperBound, double expectedResult) {
    double actualResult = SumAverage.average(lowerBound, upperBound);

    assertEquals(actualResult, expectedResult, "Average is not correct");
  }

  @Test(dataProvider = "Average")
  public void testAverageArray(int lowerBound, int upperBound, double expectedResult) {
    int[] numbers = IntStream.range(lowerBound, upperBound + 1).toArray();
    double actualResult = SumAverage.average(numbers);

    assertEquals(actualResult, expectedResult, "Average is not correct");
  }
}