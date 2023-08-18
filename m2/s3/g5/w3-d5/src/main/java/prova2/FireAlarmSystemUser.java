package prova2;

import lombok.extern.java.Log;

@Log
public class FireAlarmSystemUser implements AlarmSystem{

	
	@Override
	public void envoyAlarm(int id, String local, double lat, double lon, int smokeValue) {
		String requestUrl ="Http://" + local + "/alarm?idsonda=" + id + "&lat=" + lat + "&lon=" + lon + "&smokeValue=" + smokeValue;
		
		log.info("Alarm Request: " + requestUrl );
	}

}
