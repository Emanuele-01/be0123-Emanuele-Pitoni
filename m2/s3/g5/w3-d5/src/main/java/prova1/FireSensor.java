package prova1;

public interface FireSensor {

	public void CreateObserver(FireAlarmUser observer);
	public void RemoveObserver(FireAlarmUser observer);
	public void NotifyObsterver();
}
