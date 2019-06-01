package services;

import models.Cpu;
import repositories.ComponentRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named("cpuService")
public class CpuServiceImpl implements ComponentService<Cpu> {

    @Inject
    private ComponentRepository<Cpu> cpuComponentRepository;

    @Override
    public void create(Cpu component) {
        component.setCategory("CPU");
        cpuComponentRepository.create(component);
    }

    @Override
    public void update(Cpu component) {
        cpuComponentRepository.update(component);
    }

    @Override
    public Cpu findById(long id) {
        return cpuComponentRepository.findById(Cpu.class, id);
    }
}
