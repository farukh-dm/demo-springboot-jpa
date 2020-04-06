package demo.springboot.Continent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/continents")
public class ContinentController {
	
	@Autowired
	ContinentService continentService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<ContinentDto>> getAll() {
		
		List<ContinentDto> dtoList = continentService.getAll();
		
		return new ResponseEntity<>(dtoList, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ContinentDto> get(@PathVariable String id) {
		
		ContinentDto continentDto = continentService.get(id);
		
		return new ResponseEntity<ContinentDto>(continentDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody ContinentDto continentDto) {
		
		continentService.create(continentDto);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody ContinentDto continentDto) {
		
		continentService.update(continentDto);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> update(@PathVariable String id) {
		
		continentService.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
}
