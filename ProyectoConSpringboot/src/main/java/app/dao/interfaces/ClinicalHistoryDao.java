package app.dao.interfaces;

import app.dto.ClinicalHistoryDto;

public interface ClinicalHistoryDao {
	public void createClinicalHistory(ClinicalHistoryDto clinicalHistoryDto) throws Exception;
}
