
import java.util.Date;

// http://www.kma.go.kr/HELP/basic/help_01_04.jsp
// HeatIndex (KPARK 2020/09/27)
enum HeatIndex {
	VERY_HIGH, HIGH, USUAL, LOW;
}

public class HeatIndexDisplay implements Observer,DisplayElement{
	private HeatIndex index = null;
	private Subject weatherData;
	
    public HeatIndexDisplay(WeatherDataSubject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this); 
	}

	// fahrenheit -> celsius
	static double fromFahrenheitToCelsius(double F) {
        return (F - 32.0) * (5.0 / 9.0);
    }

	// celsius -> fahrenheit
	static double fromCelsiusToFahrenheit(double C) {
        return ((9.0 / 5.0) * C + 32.0);
    }

	// HI = -42.379 + (2.04901523*F) + (10.14333127*R) - (0.22475541*F*R) - (0.00683770*F*F) - (0.05481717*R*R) + (0.00122874*F*F*R) + (0.00085282*F*R*R) - (0.00000199*F*F*R*R) [F: temperature (fahrenheit), R: relativeHumidity (%)]
	public static double calculate(double T, double R) {
		double F = fromCelsiusToFahrenheit(T);
		double value = -42.379 + (2.04901523*F) + (10.14333127*R) - (0.22475541*F*R) - (0.00683770*F*F) - (0.05481717*R*R) + (0.00122874*F*F*R) + (0.00085282*F*R*R) - (0.00000199*F*F*R*R);		

		double adj = 0.0;
        if (R < 13.0 && F >= 80.0 && F <= 112.0) {
            adj = 0.25 * (13.0 - R) * Math.sqrt((17.0 - Math.abs(F - 95.0)) / 17.0);
        }
        if (R > 85.0 && F >= 80.0 && F <= 87) {
            adj = (R - 85.0)/10.0 * (87.0 - F) / 5.0;
            value += adj;
        }
        if (F < 80.0) {
        	value = F;
        }
        value = fromFahrenheitToCelsius(value); // (celsius)
        value = Math.round(value * 10) / 10.0; // round

        return value;
	}
	
	@Override
	public void display() {
		if(index!=null)
		{
			System.out.println("HeatIndexDisplay [index=" + index + "]");
		}
	}

	@Override
	public void update(Date dateTime,double temperature, double windVelocity, double relativeHumidity) {
		double num=calculate(temperature, relativeHumidity);
		if((num>0)&&(num<=32)) {
			this.index=HeatIndex.LOW;
		}
		else if((num>32)&&(num<41)) {
			this.index=HeatIndex.USUAL;
		}
		else if((num>41)&&(num<54)) {
			this.index=HeatIndex.HIGH;
		}
		else if(num>=54) {
			this.index=HeatIndex.VERY_HIGH;
		}
		display();
	}

}
