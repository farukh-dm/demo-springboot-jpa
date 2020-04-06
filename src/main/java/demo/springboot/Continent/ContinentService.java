package demo.springboot.Continent;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinentService {
	
	@Autowired
	ContinentRepository continentRepository;
	
	public List<ContinentDto> getAll() {
		
		List<ContinentDto> dtoList = new ArrayList<ContinentDto>();
		
		continentRepository.findAll().forEach(item -> {
			dtoList.add(item);
		});
		
		// OR // continentRepository.findAll().forEach(dtoList::add);
		
		return dtoList;
	}
	
	public void create(ContinentDto entityDto) {
		
		entityDto = continentRepository.save(entityDto);
		
	}
	
	public void update(ContinentDto entityDto) {
		
		entityDto = continentRepository.save(entityDto);
		
	}
	
	public void delete(String id) {
		
		ContinentDto continentDto = continentRepository.findById(id).get();
		
		if(null != continentDto) {
			continentRepository.delete(continentDto);
		}
		
	}
	
	public ContinentDto get(String id) {
		
		return continentRepository.findById(id).get();
		
	}

}
