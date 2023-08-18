package Emanuele.demo.exceptions;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorPayload {

	private String messaggio;
	private Date timeStamp;
	private int internalCode;
}
