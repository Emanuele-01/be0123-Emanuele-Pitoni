package emanuele.w3d2.run;

import java.util.Date;
import emanuele.w3d2.entities.Info;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InfoRun implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		Info i = new Info("Stefano", "Di Santo", new Date());
	}

}
