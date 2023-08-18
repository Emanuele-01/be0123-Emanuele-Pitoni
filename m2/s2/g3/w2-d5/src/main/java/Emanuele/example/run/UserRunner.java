package Emanuele.example.run;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import Emanuele.example.entities.User;
import Emanuele.example.service.UserService;

@Component
public class UserRunner implements CommandLineRunner{
	
	@Autowired
	UserService us;

	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker(new Locale("it"));
		
		for(int j = 0 ; j<= 20; j++){
			
			User user = new User();
            user.setUserName(faker.name().username());
            user.setName(faker.name().firstName());
            user.setLastName(faker.name().lastName());
            user.setEmail(faker.internet().emailAddress());
            user.setPassword(faker.internet().password());
			
			us.create(user);
		};
	}

}
