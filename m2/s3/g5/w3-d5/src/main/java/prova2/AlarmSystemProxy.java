package prova2;

public class AlarmSystemProxy implements AlarmSystem{

	private AlarmSystem realSystem;
	
	
	public AlarmSystemProxy(AlarmSystem realSystem) {
		super();
		this.realSystem = realSystem;
	}


	@Override
	public void envoyAlarm(int id, String local, double lat, double lon, int smokeValue) {
		
		if(smokeValue > 5) {
			realSystem.envoyAlarm(id, local, lat, lon, smokeValue);
		};
		
	}

}
