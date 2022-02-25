package com.model.service;

import java.util.List;

import com.model.persistence.Trainee;
import com.model.persistence.TraineeDao;
import com.model.persistence.TraineeDaoImpl;

public class TraineeServiceImpl implements TraineeService {

	private TraineeDao traineeDao;
	
	public TraineeServiceImpl() {
		traineeDao = new TraineeDaoImpl();
	}
	
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public List<Trainee> getAll() {
		return traineeDao.getAll();
	}

	
	
}
