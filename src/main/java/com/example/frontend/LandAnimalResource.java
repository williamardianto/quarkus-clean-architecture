package com.example.frontend;

import com.example.core.dto.AnimalDTO;
import com.example.core.entity.Animal;
import com.example.service.LandAnimalService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/animals")
public class LandAnimalResource {

    @Inject
    LandAnimalService landAnimalService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create() {
        AnimalDTO animalDTO = new AnimalDTO("Lion", 80, 4);
        Animal animal = landAnimalService.create(animalDTO);
        return Response.ok(animal).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        return Response.ok(landAnimalService.getTwoLegsAnimals()).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") Long id) {
        return Response.ok(landAnimalService.findById(id)).build();
    }
}
