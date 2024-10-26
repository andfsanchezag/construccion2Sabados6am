package app.dao.interfaces;

import app.dto.PetDto;

public interface PetDao {
	public void createPet(PetDto petDto) throws Exception;
	public PetDto findById(PetDto petDto) throws Exception;
	public boolean existsById(PetDto petDto) throws Exception;
}
