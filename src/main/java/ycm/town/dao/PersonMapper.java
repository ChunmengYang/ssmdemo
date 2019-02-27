package ycm.town.dao;

import java.util.List;
import ycm.town.model.Person;

public interface PersonMapper {
	
   void insert(Person person);
   
   void update(Person person);
   
   Person query(int id);
   
   List<Person> queryAll();
}
