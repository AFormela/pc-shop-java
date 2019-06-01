package services;

import models.Gpu;
import repositories.ComponentRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named("gpuService")
public class GpuServiceImpl implements ComponentService<Gpu> {

    @Inject
    private ComponentRepository<Gpu> gpuComponentRepository;

    @Override
    public void create(Gpu component) {
        component.setCategory("GPU");
        gpuComponentRepository.create(component);
    }

    @Override
    public void update(Gpu component) {
        gpuComponentRepository.update(component);
    }

    @Override
    public Gpu findById(long id) {
        return gpuComponentRepository.findById(Gpu.class, id);
    }
}
