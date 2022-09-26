package hello.typeconverter.formatter;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class MyNumberFormatterTest {

	MyNumberFormatter formatter = new MyNumberFormatter();
	
	@Test
	public void testParse() throws ParseException {
		Number result = formatter.parse("1,000", Locale.KOREA);
		assertThat(result).isEqualTo(1000L);
	}

	@Test
	public void testPrint() {
		String result = formatter.print(1000, Locale.KOREA);
		assertThat(result).isEqualTo("1,000");
	}

}
