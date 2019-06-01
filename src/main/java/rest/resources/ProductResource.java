package rest.resources;

import models.Comment;
import models.Product;
import services.ProductService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {

    @Inject
    private ProductService productService;

    @GET
    public Response findAllProducts() {
        return Response.ok(productService.findAll()).build();
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") long id) {
        Product product = productService.findById(id);
        if (product == null) {
            return Response.status(404).build();
        } else {
            return Response.ok(product).build();
        }
    }

    @GET
    @Path("/categories")
    public Response findCategories() {
        return Response.ok(productService.findCategories()).build();
    }

    @GET
    @Path("/query")
    public Response findByQuery(@Context UriInfo info) {

        double priceStart, priceEnd;
        String category = info.getQueryParameters().getFirst("category");
        String name = info.getQueryParameters().getFirst("name");

        try {
            priceStart = Double.parseDouble(info.getQueryParameters().getFirst("from"));
            priceEnd = Double.parseDouble(info.getQueryParameters().getFirst("to"));
        } catch (NullPointerException|NumberFormatException e) {
            priceStart = 0;
            priceEnd = 0;
        }

        if (category != null && name != null && priceStart != 0 && priceEnd != 0) {
            return Response.ok(productService.findByCategoryAndNameAndPrice(category, name, priceStart, priceEnd)).build();
        } else if (category != null) {
            return Response.ok(productService.findByCategory(category)).build();
        } else if (name != null) {
            return Response.ok(productService.findByName(name)).build();
        } else if (priceStart != 0 && priceEnd != 0) {
            return Response.ok(productService.findByPrice(priceStart, priceEnd)).build();
        }

        return Response.status(404).build();
    }

    @GET
    @Path("/{id}/comments")
    public Response findCommentsByProductId(@PathParam("id") long id) {
        List<Comment> result = productService.findById(id).getComments();
        if (result == null) {
            return Response.status(404).build();
        } else {
            return Response.ok(result).build();
        }
    }

    @POST
    @Path("/{id}/comments")
    public Response addComment(@PathParam("id") long id, Comment comment) {
        Product product = productService.findById(id);
        if (product == null) {
            return Response.status(404).build();
        } else {
            product.addComment(comment);
            productService.update(product);
            return Response.ok().build();
        }
    }

    @DELETE
    @Path("/{id1}/comments/{id2}")
    public Response deleteComment(@PathParam("id1") long productId, @PathParam("id2") long commentId) {
        Product product = productService.findById(productId);
        if (product == null) {
            return Response.status(404).build();
        } else {
            Comment comment = productService.findComment(product.getComments(), commentId);
            if (comment == null) {
                return Response.status(404).build();
            }
            product.removeComment(comment);
            productService.update(product);
            return Response.ok().build();
        }
    }
}
