package com.ase.api.service;

import com.ase.bean.BaseBean;
import com.ase.bean.RegisterBean;
import org.apache.cxf.jaxrs.model.wadl.ElementClass;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Gurrala on 2/21/2015.
 */
@Service
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public interface LoginService {
    @Path("")
    @POST
    @ElementClass(response = BaseBean.class)
    public BaseBean login(@QueryParam("username") String username, @QueryParam("password") String password);

    @Path("/register")
    @PUT
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @ElementClass(request = RegisterBean.class, response = BaseBean.class)
    public BaseBean register(BaseBean baseBean);
}
