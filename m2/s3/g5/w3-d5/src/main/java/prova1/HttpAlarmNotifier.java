package prova1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;

@Data
@AllArgsConstructor
@Log
public class HttpAlarmNotifier implements FireAlarmUser{
	
	private String url;

	@Override
	public void update(int id, double lat, double lon, int smokeValue) {
		
		String requestUrl = url + "?idsonda=" + id + "&lat=" + lat + "&lon=" + lon + "&smokeValue=" + smokeValue;
		
		log.info("Alarm Request: " + requestUrl );
	}

}
