package com.ase.api.service.rest.implementation;

import com.ase.api.service.LoginService;
import com.sun.xml.bind.v2.TODO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Gurrala on 2/21/2015.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(String username, String password) {


        return "login";
    }
}