import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeatherDataImporter{
	public static final SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
	
	public static List<WeatherData> loadCSV(String filename){
		List<WeatherData> weatherdatas=new ArrayList<WeatherData>();
		Date dateTime=null;
		double temperature=0.0;
		double windVelocity=0.0;
		double relativeHumidity=0.0;
		String line="";
		int count=0;
		
		try
		{
			BufferedReader br= new BufferedReader(new FileReader(filename));
			while((line=br.readLine())!=null) {
				if(count==0) {
					System.out.print("line contains: ");
					System.out.println(line);
					count++;
				}
				else {
					String[] array=line.split(",");
					dateTime = formatter.parse(array[2]);
					System.out.print(dateTime+",");
					temperature=Double.parseDouble(array[3]);
					windVelocity=Double.parseDouble(array[4]);
					relativeHumidity=Double.parseDouble(array[5]);
					System.out.println(temperature+","+windVelocity+","+relativeHumidity);
					
					WeatherData weatherData=new WeatherData(dateTime,temperature,windVelocity,relativeHumidity);
					weatherdatas.add(weatherData);
					
				}
			}
            
        }catch ( IOException e) {
            System.out.println(e);
        } catch (ParseException e) {
			e.printStackTrace();
		}
		return weatherdatas;
	}
	
	
}
