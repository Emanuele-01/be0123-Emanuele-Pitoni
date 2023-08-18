package emanuele.w3d5;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import prova1.FireAlarmUser;
import prova1.FireSonde;
import prova1.HttpAlarmNotifier;
import prova2.AlarmSystem;
import prova2.AlarmSystemProxy;
import prova2.FireAlarmSystemUser;


@SpringBootApplication
public class W3D5ApplicationTests {

	public static void main(String[] args) {
	System.out.println("--------------------  Observer --------------------------------");
	System.out.println(" ");
//		creazione sonde 
		
		FireSonde fs = new FireSonde(836, 40.7128, 74.0060, 0);
		FireSonde fs1 = new FireSonde(532, 33.8651, 151.2099, 0);
		FireSonde fs2 = new FireSonde(923, 22.9068, 43.1729, 0);
		FireSonde fs3 = new FireSonde(123, 41.9028, 12.4964, 0);
		
// 		creazione Controllo
		FireAlarmUser allrmUser = new HttpAlarmNotifier("http://Sydney");
		FireAlarmUser allrmUser2 = new HttpAlarmNotifier("http://New York City");
		FireAlarmUser allrmUser3 = new HttpAlarmNotifier("http://Rio de Janeiro");
		FireAlarmUser allrmUser4 = new HttpAlarmNotifier("http://Roma");
		
//      aggiunta delle sonde ai controlli
		fs.CreateObserver(allrmUser2);
		fs1.CreateObserver(allrmUser);
		fs2.CreateObserver(allrmUser3);
		fs3.CreateObserver(allrmUser4);
		
// scateno l'allarme
		
		fs.SetSmokeValue(6);
		fs3.SetSmokeValue(10);
		
		
		System.out.println(" ");
		System.out.println("--------------------  proxy ---------------------------------");
		System.out.println(" ");
// creazione sistema
		
		AlarmSystem as = new FireAlarmSystemUser();
		
// creazione del proxy
		
		AlarmSystem proxy = new AlarmSystemProxy(as);
		
// inivio dell'allarme
		
		proxy.envoyAlarm(273, "Cittá_del_Messico", 19.4326, 99.1332, 6);
		proxy.envoyAlarm(735, "Cittá_del_Capo", 22.9068, 43.1729, 8);
		proxy.envoyAlarm(345, "Londra", 51.5074, 0.1278, 3);
		
	}

}

