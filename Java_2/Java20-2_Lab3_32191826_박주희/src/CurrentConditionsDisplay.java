import java.util.Date;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private Date dateTime=null;
	private double temperature=0.0;
	private double windVelovity=0.0;
	private double relativeHumidity=0.0;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(WeatherDataSubject weatherData) {
		this.weatherData=weatherData; 
		this.weatherData.addObserver(this); 
	}
	

	@Override
	public void display() {
		System.out.println("CurrentConditionsDisplay [dateTime=" + dateTime + ", temperature=" + temperature + ", windVelovity="
				+ windVelovity + ", relativeHumidity=" + relativeHumidity + "]");
	}
	
	@Override
	public void update(Date dateTime,double temperature, double windVelocity, double relativeHumidity) {
		this.dateTime=dateTime;
		this.temperature=temperature;
		this.windVelovity=windVelocity;
		this.relativeHumidity=relativeHumidity;
		display(); 
	}

}
