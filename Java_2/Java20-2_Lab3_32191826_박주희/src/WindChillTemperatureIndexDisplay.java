import java.util.Date;


// http://www.kma.go.kr/HELP/basic/help_01_07.jsp
// WindChillTemperatureIndex (KPARK 2020/09/27)
enum WindChillTemperatureIndex {
	DANGER, WARNING, CAUTION, AWARE;
}

public class WindChillTemperatureIndexDisplay implements Observer,DisplayElement{
	private Subject weatherData;
	private WindChillTemperatureIndex index = null;
	
	public WindChillTemperatureIndexDisplay(WeatherDataSubject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}

	// (Km/h) 1 m/s = 3.6 Km/h = (1/1000) Km / (1/3600) h
    static double fromMStoKMH(double ms) {
    	return ms * 3.6;
    }

    static double fromKMHtoMS(double kmh) {
    	return kmh / 3.6;
    }

	public static double calculate(double T, double W) {
		double V = fromMStoKMH(W);
		double value = 0.0;
        if (V > 4.8) {
    		value = 13.12 + 0.6215*T - 11.37 * Math.pow(V, 0.16) + 0.3965 * Math.pow(V, 0.16) * T;
            if (value > T) {
                value = T;
            }
        }
        else {
            value = T;
        }
		value = Math.round(value);
		return value;
	}

	@Override
	public void display() {
		if(index!=null) {
		System.out.println("WindChillTemperatureIndexDisplay [index=" + index + "]");
		}
	}

	@Override
	public void update(Date dateTime,double temperature, double windVelocity, double relativeHumidity) {
		if((temperature<=10)&&(windVelocity>=1.3))
		{
			double num=calculate(temperature,windVelocity);
			if(num>=-10) {
				index=WindChillTemperatureIndex.AWARE;
			}
			else if((num>=-25)&&(num<-10)) {
				index=WindChillTemperatureIndex.CAUTION;
			}
			else if((num>=-45)&&(num<-25)) {
				index=WindChillTemperatureIndex.DANGER;
			}
			else if(num<-45) {
				index=WindChillTemperatureIndex.WARNING;
			}
			display();
		}

	}
}
