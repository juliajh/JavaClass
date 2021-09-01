import java.util.Date;

public interface Observer {
	public void update(Date dateTime,double temperature, double windVelocity, double relativeHumidity);
}
