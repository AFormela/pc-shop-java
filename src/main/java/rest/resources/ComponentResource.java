package rest.resources;

import models.*;
import services.ComponentService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/components")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ComponentResource {

    @Inject
    @Named("cpuService")
    private ComponentService<Cpu> cpuComponentService;
    @Inject
    @Named("gpuService")
    private ComponentService<Gpu> gpuComponentService;
    @Inject
    @Named("hardDriveService")
    private ComponentService<HardDrive> hardDriveComponentService;
    @Inject
    @Named("motherBoardService")
    private ComponentService<MotherBoard> motherBoardComponentService;
    @Inject
    @Named("ramService")
    private ComponentService<Ram> ramComponentService;

    @POST
    @Path("/cpu")
    public Response addCpu(Cpu cpu) {
        cpuComponentService.create(cpu);
        return Response.ok().build();
    }

    @PUT
    @Path("/cpu/{id}")
    public Response updateCpuById(@PathParam("id") long id, Cpu cpu) {
        Cpu result = cpuComponentService.findById(id);
        if (result == null) {
            return Response.status(404).build();
        } else {
            cpu.setId(id);
            cpuComponentService.update(cpu);
            return Response.ok().build();
        }
    }

    @POST
    @Path("/gpu")
    public Response addGpu(Gpu gpu) {
        gpuComponentService.create(gpu);
        return Response.ok().build();
    }

    @PUT
    @Path("/gpu/{id}")
    public Response updateGpuById(@PathParam("id") long id, Gpu gpu) {
        Gpu result = gpuComponentService.findById(id);
        if (result == null) {
            return Response.status(404).build();
        } else {
            gpu.setId(id);
            gpuComponentService.update(gpu);
            return Response.ok().build();
        }
    }

    @POST
    @Path("/hard-drive")
    public Response addHardDrive(HardDrive hardDrive) {
        hardDriveComponentService.create(hardDrive);
        return Response.ok().build();
    }

    @PUT
    @Path("/hard-drive/{id}")
    public Response updateHardDriveById(@PathParam("id") long id, HardDrive hardDrive) {
        HardDrive result = hardDriveComponentService.findById(id);
        if (result == null) {
            return Response.status(404).build();
        } else {
            hardDrive.setId(id);
            hardDriveComponentService.update(hardDrive);
            return Response.ok().build();
        }
    }

    @POST
    @Path("/motherboard")
    public Response addMotherBoard(MotherBoard motherBoard) {
        motherBoardComponentService.create(motherBoard);
        return Response.ok().build();
    }

    @PUT
    @Path("/motherboard/{id}")
    public Response updateMotherBoardById(@PathParam("id") long id, MotherBoard motherBoard) {
        MotherBoard result = motherBoardComponentService.findById(id);
        if (result == null) {
            return Response.status(404).build();
        } else {
            motherBoard.setId(id);
            motherBoardComponentService.update(motherBoard);
            return Response.ok().build();
        }
    }

    @POST
    @Path("/ram")
    public Response addRam(Ram ram) {
        ramComponentService.create(ram);
        return Response.ok().build();
    }

    @PUT
    @Path("/ram/{id}")
    public Response updateRamById(@PathParam("id") long id, Ram ram) {
        Ram result = ramComponentService.findById(id);
        if (result == null) {
            return Response.status(404).build();
        } else {
            ram.setId(id);
            ramComponentService.update(ram);
            return Response.ok().build();
        }
    }

}
