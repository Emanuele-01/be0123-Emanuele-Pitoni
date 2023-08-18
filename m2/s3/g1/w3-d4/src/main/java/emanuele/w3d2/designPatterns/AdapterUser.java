package emanuele.w3d2.designPatterns;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import emanuele.w3d2.entities.DataSource;
import emanuele.w3d2.entities.Info;

public class AdapterUser implements DataSource{
	
	private Info info;

	@Override
	public String getNomeCompleto() {
		
		return null;
	}

	@Override
	public int getEta() {
		LocalDate dataNascita = this.info.getDataDiNascita().toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDate();;
		LocalDate currentDate = LocalDate.now();

		return Period.between(dataNascita, currentDate).getYears();
	}

}
