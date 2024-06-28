package com.dell.tms.service;

import java.util.ArrayList;

import com.dell.tms.bean.Trainee;
import com.dell.tms.dao.TraineeDao;


public class TraineeService {

	TraineeDao dao=new TraineeDao();
			
	public boolean validateUser(String uname, String pwd) {
		boolean flag= dao.validateUser(uname, pwd);
		return flag;

	}

	public boolean deleteTrainee(int pid) {
		boolean flag= dao.deleteTrainee(pid);
		return flag;
	}
	
	public boolean updateTrainee(Trainee t) {
		
		boolean flag= dao.updateTrainee(t);
		return flag;
	}
	
	public boolean addTrainee(Trainee t) {
		boolean flag= dao.addTrainee(t);
		return flag;
	}
	public ArrayList<Trainee> getAllTrainee(){
		ArrayList<Trainee> tList = dao.getAllTrainee();
		return tList;
	}
	public Trainee getTraineeId(int trnId) {
		Trainee t = dao.searchTrainee(trnId);
		return t;
	}

	
	

	
	
}
