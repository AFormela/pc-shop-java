package services;

import models.HardDrive;
import repositories.ComponentRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named("hardDriveService")
public class HardDriveServiceImpl implements ComponentService<HardDrive> {

    @Inject
    private ComponentRepository<HardDrive> hardDriveComponentRepository;

    @Override
    public void create(HardDrive component) {
        component.setCategory("HardDrive");
        hardDriveComponentRepository.create(component);
    }

    @Override
    public void update(HardDrive component) {
        hardDriveComponentRepository.update(component);
    }

    @Override
    public HardDrive findById(long id) {
        return hardDriveComponentRepository.findById(HardDrive.class, id);
    }
}
