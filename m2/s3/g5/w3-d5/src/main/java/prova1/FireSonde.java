package prova1;

import java.util.ArrayList;
import java.util.List;
import lombok.Setter;

@Setter
public class FireSonde implements FireSensor{

	private int id;
	private double lat;
	private double lon;
	private int smokeValue;
	private List<FireAlarmUser> observers;
	
	public FireSonde(int id, double lat, double lon, int smokeValue) {
		super();
		this.id = id;
		this.lat = lat;
		this.lon = lon;
		this.smokeValue = smokeValue;
		this.observers = new ArrayList<>();
	}
	
	
	public void SetSmokeValue(int smokeValue) {
		this.smokeValue = smokeValue;
		if(smokeValue > 5) {
			NotifyObsterver();
		}
	};
	
	@Override
	public void CreateObserver(FireAlarmUser observer) {
		observers.add(observer);
		
	}

	@Override
	public void RemoveObserver(FireAlarmUser observer) {
		observers.remove(observer);
		
	}

	@Override
	public void NotifyObsterver() {
		 for (FireAlarmUser observer : observers) {
	            observer.update(id, lat, lon, smokeValue);
	        }
		
	}

}
