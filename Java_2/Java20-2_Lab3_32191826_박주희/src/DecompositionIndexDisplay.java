import java.util.Date;

// http://www.kma.go.kr/HELP/basic/help_01_03_01.jsp
// DecompositionIndex (KPARK 2020/09/27)
enum DecompositionIndex {
	HIGH, NORMAL, LOW;
}

public class DecompositionIndexDisplay implements Observer,DisplayElement{
	private DecompositionIndex index = null;
	private Subject weatherData;
	
	public DecompositionIndexDisplay(WeatherDataSubject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this); 
	}

	// DecompositionIndex = (RH - 65)/14 * (1.054^T) [RH: relativeHumidity (%), T: temperature (celsius)]
	public static double calculate(double T, double RH) {
		double value = (RH - 65.0)/14.0 * Math.pow(1.054, T);
        value = Math.round(value * 100) / 100.0; // 소수점 두째자리 반올림
        return value;
	}
	
	@Override
	public void display() {
		if(index!=null) {
		 System.out.println("DecompositionIndexDisplay [index=" + index + "]");
		}
	}

	@Override
	public void update(Date dateTime,double temperature, double windVelocity, double relativeHumidity) {
		double num=calculate(temperature,relativeHumidity);
		if((num>=0)&&(num<3)) {
			this.index=DecompositionIndex.LOW;
		}
		else if((num>=3)&&(num<7)) {
			this.index=DecompositionIndex.NORMAL;
		}
		else if(num>=7) {
			this.index=DecompositionIndex.HIGH;
		}
		display();
	}
}
