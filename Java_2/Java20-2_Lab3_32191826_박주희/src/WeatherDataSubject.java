import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class WeatherDataSubject implements Runnable,Subject{

	private List<Observer> observers;
	private List<WeatherData> data;
	private boolean stopRunning=false;
	private int currentindex=0;
	
	public WeatherDataSubject(List<WeatherData> data){
		this.data=data; 
		this.observers=new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer o) {
		try {
			observers.add(o);
			Thread.sleep((long)(Math.random() * 1000));
		}catch(Exception e) {}

	}
	
	@Override
	public void removeObserver(Observer o) {
		int i=observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
	}
	
	@Override
	public void notifyObservers() {
		WeatherData d=data.get(currentindex);
		for(Observer o:observers) {
			o.update(d.getDateTime(),d.getTemperature(), d.getWindVelocity(), d.getRelativeHumidity());
		}
		System.out.println();
	}
	
	@Override
	public void run() {	
		while(!stopRunning) {
			for(WeatherData wd:data){
				notifyObservers();
				try {
					Thread.sleep(1000);
					currentindex++;
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("실행 종료");
		
	}
	public void threadStop(boolean stopRunning) {
		this.stopRunning=stopRunning;
	}
	

}