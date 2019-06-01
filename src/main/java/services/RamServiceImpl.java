package services;

import models.Ram;
import repositories.ComponentRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named("ramService")
public class RamServiceImpl implements ComponentService<Ram> {

    @Inject
    private ComponentRepository<Ram> ramComponentRepository;

    @Override
    public void create(Ram component) {
        component.setCategory("RAM");
        ramComponentRepository.create(component);
    }

    @Override
    public void update(Ram component) {
        ramComponentRepository.update(component);
    }

    @Override
    public Ram findById(long id) {
        return ramComponentRepository.findById(Ram.class, id);
    }
}
