package tutorial;

import static org.junit.Assert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Color1Test {

	@Test
	@DisplayName("1つ目のテスト")
	public void testGetColor() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(1);
		assertEquals(t1,"赤");
	}
	
	@Test
	@DisplayName("2つ目のテスト")
	public void testGetColor2() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(2);
		assertEquals(t1,"青");
	}
	
	@Test
	@DisplayName("3つ目のテスト")
	public void testGetColor3() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(3);
		assertEquals(t1,"1or2を入力して下さい");
	}
}
