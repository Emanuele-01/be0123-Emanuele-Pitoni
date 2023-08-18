package Emanuele.example.run;

import org.springframework.stereotype.Component;

import Emanuele.example.entities.TypeDevice;
import Emanuele.example.entities.Device;
import Emanuele.example.entities.StateDevice;
import Emanuele.example.service.DeviceService;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@Component
public class DeviceRunner implements CommandLineRunner{

	@Autowired
	DeviceService ds;
	
	
	@Override
	public void run(String... args) throws Exception {
		
	 
		Device d1 = new Device(TypeDevice.LAPTOP, StateDevice.ASSEGNATO);
		
		Device d2 = new Device(TypeDevice.TABLET, StateDevice.ASSEGNATO);
		
		Device d3 = new Device(TypeDevice.SMARTPHONE, StateDevice.DISMESSO);
		
		Device d4 = new Device(TypeDevice.SMARTPHONE, StateDevice.DISPONIBILE);
		
		Device d5 = new Device(TypeDevice.LAPTOP, StateDevice.ASSEGNATO);
		
		Device d6 = new Device(TypeDevice.LAPTOP, StateDevice.IN_MANUTENZIONE);
		
		Device d7 = new Device(TypeDevice.TABLET, StateDevice.IN_MANUTENZIONE);
		
		Device d8 = new Device(TypeDevice.TABLET, StateDevice.DISPONIBILE);
		
		Device d9 = new Device(TypeDevice.SMARTPHONE, StateDevice.ASSEGNATO);
		
		Device d10 = new Device(TypeDevice.SMARTPHONE, StateDevice.DISMESSO);
		
		Device d11= new Device(TypeDevice.LAPTOP, StateDevice.DISMESSO);
		
		Device d12= new Device(TypeDevice.LAPTOP, StateDevice.DISPONIBILE);
		
		Device d13= new Device(TypeDevice.SMARTPHONE, StateDevice.ASSEGNATO);
		
		Device d14= new Device(TypeDevice.LAPTOP, StateDevice.DISPONIBILE);
		
		List<Device> device = new ArrayList<>();
		
		device.add(d1);
		device.add(d2);
		device.add(d3);
		device.add(d4);
		device.add(d5);
		device.add(d6);
		device.add(d7);
		device.add(d8);
		device.add(d9);
		device.add(d10);
		device.add(d11);
		device.add(d12);
		device.add(d13);
		device.add(d14);
		
		for(Device d : device) {
			ds.Create(d);
		};
	}

}
