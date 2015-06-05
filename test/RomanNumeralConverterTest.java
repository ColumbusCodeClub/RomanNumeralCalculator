import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class RomanNumeralConverterTest {
	RomanNumeralConverter underTest;
	
	@Before
	public void setup() {
		underTest = new RomanNumeralConverter();
	}

	@Test
	public void shouldConvertIto1() {
		assertThat(underTest.convert("I"), is(1));
	}

	@Test
	public void shouldConvertIIto2() {
		assertThat(underTest.convert("II"), is(2));
	}
	
	@Test
	public void shouldConvertIIIto3() {
		assertThat(underTest.convert("III"), is(3));
	}
	
	@Test
	public void shouldConvertIVto4() {
		assertThat(underTest.convert("IV"), is(4));
	}
	
	@Test
	public void shouldConvertVto5() {
		assertThat(underTest.convert("V"), is(5));
	}
	
	@Test
	public void shouldConvertVIto6() {
		assertThat(underTest.convert("VI"), is(6));
	}
	
	@Test
	public void shouldConvertVIIto7() {
		assertThat(underTest.convert("VII"), is(7));
	}
	
	@Test
	public void shouldConvertIXto9() {
		assertThat(underTest.convert("IX"), is(9));
	}
	
	@Test
	public void shouldConvertXIVto14(){
		assertThat(underTest.convert("XIV"), is(14));
	}
	
	@Test
	public void shouldConvertXVto15(){
		assertThat(underTest.convert("XV"), is(15));
	}
	
	@Test
	public void shouldConvertXIXto19(){
		assertThat(underTest.convert("XIX"), is(19));
	}
	
	@Test
	public void shouldConvertXLto40(){
		assertThat(underTest.convert("XL"), is(40));
	}
	
	@Test
	public void shouldConvertXLIVto44(){
		assertThat(underTest.convert("XLIV"), is(44));
	}
	
	@Test
	public void shouldConvertXLIXto49() {
		assertThat(underTest.convert("XLIX"), is(49));
	}
	
	

}
