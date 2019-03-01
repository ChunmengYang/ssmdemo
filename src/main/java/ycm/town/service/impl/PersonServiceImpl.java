package ycm.town.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ycm.town.dao.PersonMapper;
import ycm.town.model.Person;
import ycm.town.service.IPersonService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {
    
    private PersonMapper personMapper;

    public PersonMapper getPersonMapper() {
        return personMapper;
    }
    
    @Autowired
    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }
    
    @Transactional
	@Override
	public void insertPerson(Person person) {
		// TODO Auto-generated method stub
		personMapper.insert(person);
	}
	
	@Transactional
	@Override
	public void updatePersonName(int id, String name) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		personMapper.update(person);
	}
	
	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return personMapper.query(id);
	}
	
	@Override
    public List<Person> loadPersons() {
        return personMapper.queryAll();
    }
}