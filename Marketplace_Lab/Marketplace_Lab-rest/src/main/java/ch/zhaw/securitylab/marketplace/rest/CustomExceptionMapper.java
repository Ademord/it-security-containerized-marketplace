package ch.zhaw.securitylab.marketplace.rest;

import ch.zhaw.securitylab.marketplace.dto.RestErrorDto;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable exception) {
        RestErrorDto error = new RestErrorDto();
        error.setError(exception.getMessage());
        Response.ResponseBuilder responseBuilder;
        return Response.status(Status.BAD_REQUEST).entity(error).build();
    }
}
