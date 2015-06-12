import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;


public class ArabicToRomanConverterTest {

	@Test
	public void shouldConvert1toI() {
		assertThat(new ArabicToRomanConverter().convert(1), is("I"));
	}
	
	@Test
	public void shouldConvert2toII() {
		assertThat(new ArabicToRomanConverter().convert(2), is("II"));
	}
	
	@Test
	public void shouldConvert3toIII() {
		assertThat(new ArabicToRomanConverter().convert(3), is("III"));
	}
	
	@Test
	public void shouldConvert5toV() {
		assertThat(new ArabicToRomanConverter().convert(5), is("V"));
	}
	
	@Test
	public void shouldConvert4toIV() {
		assertThat(new ArabicToRomanConverter().convert(4), is("IV"));
	}
	
	@Test
	public void shouldConvert6toVI() {
		assertThat(new ArabicToRomanConverter().convert(6), is("VI"));
	}
	
	@Test
	public void shouldConvert7toVII() {
		assertThat(new ArabicToRomanConverter().convert(7), is("VII"));
	}
	
	@Test
	public void shouldConvert8toVIII() {
		assertThat(new ArabicToRomanConverter().convert(8), is("VIII"));
	}
	
	@Test
	public void shouldConvert10toX() {
		assertThat(new ArabicToRomanConverter().convert(10), is("X"));
	}
	
	@Test
	public void shouldConvert9ToIX() {
		assertThat(new ArabicToRomanConverter().convert(9), is("IX"));
	}
	
	@Test
	public void shouldConvert11toX1() {
		assertThat(new ArabicToRomanConverter().convert(11), is("XI"));
	}
}
