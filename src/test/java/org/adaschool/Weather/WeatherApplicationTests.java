package org.adaschool.Weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeatherApplicationTests {

	@Autowired
	private WeatherReportController weatherReportController;

	@MockBean
	private WeatherReportService weatherReportService;


	private WeatherReport weatherReport;

	private MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

}
