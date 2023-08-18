package Emanuele.example.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Emanuele.example.entities.Device;
import Emanuele.example.service.DeviceService;

@RestController
@RequestMapping("/device")
public class DeviceController {
	
	@Autowired
	DeviceService ds;
	
	@GetMapping("")
	public Page<Device> getDevices(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "id") String Sorted){
		return ds.find(page, size, Sorted);
	};
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Device createDevice(@RequestBody Device d) {
		return ds.Create(d);
	};
	
	@GetMapping("/{:Id}")
	public Device getDevice(@PathVariable UUID id) throws Exception{
		return ds.findId(id);
	}
	
	@PutMapping("/{:id}")
	public Device putDevice(@PathVariable UUID id, @RequestBody Device u) throws Exception{
		return ds.findAndUpdate(id, u);
	};
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{:id}")
	public void removeDevice(@PathVariable UUID id) throws Exception{
		ds.findAndDelete(id);
	}
}
