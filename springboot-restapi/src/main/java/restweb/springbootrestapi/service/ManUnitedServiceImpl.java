package restweb.springbootrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restweb.springbootrestapi.dao.ManUnitedPlayerRepository;
import restweb.springbootrestapi.model.ManUnitedPlayer;

import java.util.List;
import java.util.Optional;

@Service
public class ManUnitedServiceImpl implements ManUnitedService{

    private final ManUnitedPlayerRepository manUnitedPlayerRepository;

    @Autowired
    public ManUnitedServiceImpl(ManUnitedPlayerRepository manUnitedPlayerRepository) {
        this.manUnitedPlayerRepository = manUnitedPlayerRepository;
    }

    @Override
    public List<ManUnitedPlayer> findAll() {
        return manUnitedPlayerRepository.findAll();
    }

    @Override
    public ManUnitedPlayer findById(int id) {
        Optional<ManUnitedPlayer> player = manUnitedPlayerRepository.findById(id);

        ManUnitedPlayer manUnitedPlayer;

        if(player.isPresent()){
            manUnitedPlayer = player.get();
        } else {
            throw new RuntimeException("Man United player not found id -" +id);
        }

        return manUnitedPlayer;
    }

    @Override
    public void save(ManUnitedPlayer player) {
        manUnitedPlayerRepository.save(player);
    }

    @Override
    public void deleteById(int id) {
        manUnitedPlayerRepository.deleteById(id);
    }
}
