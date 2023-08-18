package Emanuele.example.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Emanuele.example.entities.Device;
import Emanuele.example.repositories.DeviceRepository;

@Service
public class DeviceService {

	@Autowired
	DeviceRepository repository;
	
	public Device Create(Device d) {
		Device newD = new Device(d.getTypeDevice(), d.getStateDevice());
		return repository.save(newD);
	}; 
	
	public Page<Device> find(int page, int size, String sortedBy){
		if (size < 0) size = 10;
		
		if (size > 50) size = 50;
		Pageable pageable = PageRequest.of(page, size, Sort.by(sortedBy));
		
		return repository.findAll(pageable);
	}
	
	public Device findId (UUID id) throws Exception{
		return repository.findById(id).orElseThrow(() -> new Exception("utente non trovato"));
	};
	
	
	public Device findAndUpdate(UUID id, Device device) throws Exception{
		Device f = this.findId(id);
		
		f.setTypeDevice(device.getTypeDevice());
		f.setStateDevice(device.getStateDevice());
		
		return repository.save(f);
	}
	
	public void findAndDelete(UUID id) throws Exception {
		Device f = this.findId(id);
		repository.delete(f);
	}
}
