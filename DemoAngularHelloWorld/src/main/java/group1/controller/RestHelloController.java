package group1.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import group1.dao.UserDAO;
import group1.model.User;

@RestController
public class RestHelloController {

	@RequestMapping(value = "/helloo/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> helloo() {
		UserDAO userDAO = new UserDAO();
		List<User> listUser = userDAO.getUser();
		  if(listUser.isEmpty()){
	            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
	        }
		  System.out.println("sdsa : "+ listUser.size());
        return new ResponseEntity<List<User>>(listUser, HttpStatus.OK);
    }
	
	
}

