package com.htc.assignment2;
import java.util.*;

public class Project {
	int projectID,noOfResources;
	String projectName,projectHead;
	

	public int getProjectID() {
		Scanner userPid = new Scanner(System.in);
		System.out.println("Enter the Project ID :");
		projectID=userPid.nextInt();
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public int getNoOfResources() {
		Scanner userNoR = new Scanner(System.in);
		System.out.println("Enter the no Of Resources :");
		noOfResources=userNoR.nextInt();
		return noOfResources;
	}

	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}
	public String getProjectName() {
		Scanner userPN = new Scanner(System.in);
		System.out.println("Enter the Project Name :");
		projectName=userPN.nextLine();
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectHead() {
		Scanner userPH = new Scanner(System.in);
		System.out.println("Enter the Project Head :");
		projectHead=userPH.nextLine();
		return projectHead;
	}
	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}
	
	public void displayUserInfo() {
		System.out.println(projectID+" "+projectName+" "+noOfResources+" "+projectHead);
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Project user = new Project();
		user.getProjectID();
		user.getProjectName();
		user.getNoOfResources();
		user.getProjectHead();
		user.displayUserInfo();
	}

}
