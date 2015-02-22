package com.ase.api.service;

import com.ase.bean.BaseBean;
import org.apache.cxf.jaxrs.model.wadl.ElementClass;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Gurrala on 2/21/2015.
 */
@Service
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public interface LoginService {
    @Path("/login")
    @POST
    @ElementClass(response = BaseBean.class)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password);
}
