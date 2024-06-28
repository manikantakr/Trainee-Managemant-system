package com.dell.tms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.dell.tms.bean.Trainee;
import com.dell.tms.util.TDBUtil;

public class TraineeDao {

	public boolean validateUser(String uname,String pwd) {
	   	try {			
			Connection con = TDBUtil.getConnection();
			
			String cmd = "select * from login where username=? and password=?";
			PreparedStatement ps = con.prepareStatement(cmd);
			ps.setString(1, uname);
			ps.setString(2, pwd);
			
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			
			return false;
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	
	public boolean deleteTrainee(int pid) {
	    try {			
	        Connection con = TDBUtil.getConnection();
	        
	        String cmd = "delete from trainee where tid=?";
	        
	        PreparedStatement ps = con.prepareStatement(cmd);
	        ps.setInt(1, pid);
	        ps.executeUpdate();
	        
	        return true;
	    } catch(Exception e) {
	        e.printStackTrace();
	        return false; // Return false if an exception occurs
	    }
	}

	
	
	public boolean updateTrainee(Trainee t) {
	
		try {			
			Connection con = TDBUtil.getConnection();
			
			String cmd = "update trainee set tname=?,tlocation=?,tdomain=? where tid=?";
			
			PreparedStatement ps = con.prepareStatement(cmd);
			ps.setString(1, t.gettName());
			ps.setString(2, t.gettLocation());
			ps.setString(3, t.gettDomain());
			ps.setInt(4, t.gettId());
			ps.executeUpdate();
			return true;
		}
		catch(Exception e) {}
		  return false;
	}
		
		
	public boolean addTrainee(Trainee t) {
		try {			
			Connection con = TDBUtil.getConnection();
			
			String cmd = "insert into trainee values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(cmd);
			ps.setInt(1, t.gettId());
			ps.setString(2, t.gettName());
			ps.setString(3, t.gettLocation());
			ps.setString(4, t.gettDomain());
			ps.executeUpdate();
			return true;
		}
		catch(Exception e) {}
		  return false;
	}
	
	
	public Trainee searchTrainee(int trnId) {
		try {			
			Connection con = TDBUtil.getConnection();
			
			String cmd = "select * from trainee where tid=?";
			PreparedStatement ps = con.prepareStatement(cmd);
			ps.setInt(1, trnId);
			ResultSet rs =  ps.executeQuery();
			if(rs.next()) {
				int tId = rs.getInt(1);
				String tName = rs.getString(2);
				String tLocation = rs.getString(3);
				String tDomain = rs.getString(4);
				Trainee t = new Trainee(tId, tName, tLocation, tDomain);
				return t;
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Trainee> getAllTrainee(){
		ArrayList<Trainee> tList = new ArrayList<Trainee>();
		try {			
			Connection con = TDBUtil.getConnection();
			
			String cmd = "select * from trainee order by tid";
			PreparedStatement ps = con.prepareStatement(cmd);
			ResultSet rs =  ps.executeQuery();
			
			while (rs.next()) {
				int traineeId = rs.getInt(1);
				String traineeName = rs.getString(2);
				String traineeLocation = rs.getString(3);
				String traineeDomain = rs.getString(4);
				Trainee t1 = new Trainee(traineeId, traineeName, traineeLocation, traineeDomain);			
				tList.add(t1);
			}
			return tList;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return tList;
	}
	
}
