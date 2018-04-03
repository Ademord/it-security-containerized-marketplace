package ch.zhaw.securitylab.marketplace.rest;

import ch.zhaw.securitylab.marketplace.dto.AdminProductDto;
import ch.zhaw.securitylab.marketplace.dto.ProductDto;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ch.zhaw.securitylab.marketplace.facade.ProductFacade;
import ch.zhaw.securitylab.marketplace.service.AdminProductService;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;

@RequestScoped
@Path("admin/products")
public class AdminProductRest {

    @Inject
    private ProductFacade productFacade;
    @Inject
    AdminProductService productService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AdminProductDto> get() {
        
        // Implement
        
        return null;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void post(ProductDto productDto) {
        
        // Implement
        
    }

    @DELETE
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") String id) {
        
        // Implement

    }
}
