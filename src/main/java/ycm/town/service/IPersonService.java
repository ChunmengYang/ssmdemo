package ycm.town.service;

import java.util.List;
import ycm.town.model.Person;

public interface IPersonService {
	
	void insertPerson(Person person);
	void updatePersonName(int id, String name);
	Person getPerson(int id);
	List<Person> loadPersons();

}
