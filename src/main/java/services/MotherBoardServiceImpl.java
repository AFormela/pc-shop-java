package services;

import models.MotherBoard;
import repositories.ComponentRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named("motherBoardService")
public class MotherBoardServiceImpl implements ComponentService<MotherBoard> {

    @Inject
    private ComponentRepository<MotherBoard> motherBoardComponentRepository;

    @Override
    public void create(MotherBoard component) {
        component.setCategory("Motherboard");
        motherBoardComponentRepository.create(component);
    }

    @Override
    public void update(MotherBoard component) {
        motherBoardComponentRepository.update(component);
    }

    @Override
    public MotherBoard findById(long id) {
        return motherBoardComponentRepository.findById(MotherBoard.class, id);
    }
}
