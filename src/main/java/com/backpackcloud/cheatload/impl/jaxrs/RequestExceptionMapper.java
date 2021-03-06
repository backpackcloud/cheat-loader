package com.backpackcloud.cheatload.impl.jaxrs;

import com.backpackcloud.cheatload.RequestException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RequestExceptionMapper implements ExceptionMapper<RequestException> {

  @Override
  public Response toResponse(RequestException exception) {
    return Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build();
  }

}
