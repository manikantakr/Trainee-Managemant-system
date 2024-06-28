package com.dell.tms.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dell.tms.bean.Trainee;
import com.dell.tms.service.TraineeService;

/**
 * Servlet implementation class TDBServlet
 */
public class TDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TDBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String contextPath = request.getContextPath();
		request.setAttribute("contextPath", contextPath);
		String action = request.getParameter("action");
		String target = "";
		TraineeService service = new TraineeService();
		
          if(action.equals("Login"))
          {
        	  String uname= request.getParameter("username");
        	  String pwd= request.getParameter("pwd");
      
        	     
        	     boolean flag=service.validateUser(uname, pwd);
        	if(flag) {
        	  HttpSession sn= request.getSession();
        	  
        	  sn.setAttribute("uname", uname);
        	  target="Trainee.html";
        	  RequestDispatcher rd1 = request.getRequestDispatcher(target);
      	      rd1.forward(request, response);
        	     }
        	     else {
        	    	 target="unsuccess.jsp";
               	     RequestDispatcher rd1 = request.getRequestDispatcher(target);
             	      rd1.forward(request, response);
               	    	 
        	     }
        	    	 
        	    	 
          }
          
          
          else {
        	 
		switch (action) {
		
		case "List":			
			ArrayList<Trainee> tList=service.getAllTrainee();
			request.setAttribute("tList", tList);
			target = "RetrieveAll.jsp";
			break;
		
		case "Search":
			
			 String formType = request.getParameter("formType");
			int tid = Integer.parseInt(request.getParameter("trnid"));			
			Trainee t=service.getTraineeId(tid);
			request.setAttribute("trn", t);
			
			if ("modifyForm".equals(formType)) {
		       target="Modify.jsp";
		    } else if ("retrieveForm".equals(formType)) {
		    	target="Retrieve.jsp";
		    } else if("deleteForm".equals(formType)){
		       target="Delete.jsp";
		    }
			
			break;
			
			
		case "Add Trainee":
			int trnId= Integer.parseInt(request.getParameter("trnid"));
			String trnName= request.getParameter("trnname");
			String trnLocation= request.getParameter("trnlocation");
			String trnDomain= request.getParameter("trndomain");
			Trainee newTrainee=new Trainee(trnId,trnName,trnLocation,trnDomain);
			boolean flag= service.addTrainee(newTrainee);
			if(flag) {
			target="Add.jsp";
			}else {
				target="AddUnsuccessful.jsp";
			}
			break;
		
		case "Update":
			
            int trnId1= Integer.parseInt(request.getParameter("trnid"));
			String trnName1= request.getParameter("trnname");
			String trnLocation1= request.getParameter("trnlocation");
			String trnDomain1= request.getParameter("trndomain");
		    Trainee modTrainee=new Trainee(trnId1,trnName1,trnLocation1,trnDomain1);
			boolean flag1=service.updateTrainee(modTrainee);
			target="ModifySuccessful.jsp";
			break;
		
		case "Delete":
			int trnid2= Integer.parseInt(request.getParameter("trnid"));
			boolean cnt=service.deleteTrainee(trnid2);
			target="DeleteSuccessful.jsp";
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);
          }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
