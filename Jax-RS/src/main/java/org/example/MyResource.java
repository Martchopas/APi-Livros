package org.example;

import jakarta.validation.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Set;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("livros")
public class MyResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Livro> getAllLivro() {
        return LivroStorage.getAllLivro();
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLivro(@PathParam("id") String id){
        return Response.ok(LivroStorage.getLivroById(id)).build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addLivro(@Valid Livro livro) {
        LivroStorage.addLivro(livro);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateLivro(@PathParam("id") String id, Livro updatedLivro) {
        LivroStorage.updateLivro(id, updatedLivro);
    }
    @DELETE
    @Path("/{id}")
    public void deleteLivro(@PathParam("id") String id) {
        LivroStorage.deleteLivro(id);
    }

}
