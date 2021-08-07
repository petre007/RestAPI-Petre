package restweb.springbootrestapi.service;

import restweb.springbootrestapi.model.ManUnitedPlayer;

import java.util.List;

public interface ManUnitedService {

    List<ManUnitedPlayer> findAll();

    ManUnitedPlayer findById(int id);

    void save(ManUnitedPlayer player);

    void deleteById(int id);

}
