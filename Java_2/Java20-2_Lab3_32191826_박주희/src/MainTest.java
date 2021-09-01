import java.util.List;
import java.util.Observer;
import java.util.Random;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {
		
		List<WeatherData> data=WeatherDataImporter.loadCSV("OBS_ASOS_DD_20200924113100.csv");
		
		WeatherDataSubject weatherdata=new WeatherDataSubject(data);
		Thread t=new Thread(weatherdata);
		t.start();
		
		CurrentConditionsDisplay ccd=new CurrentConditionsDisplay(weatherdata);
		DecompositionIndexDisplay did=new DecompositionIndexDisplay(weatherdata);
		HeatIndexDisplay hid=new HeatIndexDisplay(weatherdata);
		WindChillTemperatureIndexDisplay wtid=new WindChillTemperatureIndexDisplay(weatherdata);
		
		weatherdata.threadStop(true);
		

	}

}
