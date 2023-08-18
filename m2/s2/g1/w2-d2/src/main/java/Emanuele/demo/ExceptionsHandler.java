package Emanuele.demo;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import Emanuele.demo.exceptions.NotFoundException;
import Emanuele.demo.exceptions.ErrorPayload;

@RestControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorPayload> handleNotFound(NotFoundException e) {
		ErrorPayload payload = new ErrorPayload(e.getMessage(), new Date(), 404);
		return new ResponseEntity<ErrorPayload>(payload, HttpStatus.NOT_FOUND); 
	};
}
