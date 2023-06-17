package com.myitcompany;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import com.myitcompany.entities.Company;
import com.myitcompany.entities.Department;
import com.myitcompany.services.DevelopmentService;
import com.myitcompany.services.ProjectManagementService;
import com.myitcompany.services.QAService;
import com.myitcompany.Interfaces.Service;
import com.myitcompany.utils.CostCalculator;
import com.myitcompany.utils.MyThread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    protected static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        CostCalculator.MINIMUM_PROJECT_HOURS = getUserInputAsNumber("Please enter minimum number of hours you work on project?");
        CostCalculator.MAXIMUM_PROJECT_HOURS  = getUserInputAsNumber("Please enter maximum number of hours you work on project?");


        Company myCompany = new Company();//"Solvd Laba");
        myCompany.setCompanyName("Solved Laba");


        System.out.println("*******Welcome to the " + myCompany.getCompanyName() + "**********");
        logger.info(" IT Company ");
        Department dptHR = new Department("    HR", "1", "Head Office");
        myCompany.AddDepartment(dptHR);

        Department SalesMarketing = new Department("Sales & Marketing", "2", "Head Office");
        myCompany.AddDepartment(SalesMarketing);

        Department technology = new Department("Technology", "3", "Local Office");
        myCompany.AddDepartment(technology);

        Department QADepartment = new Department("QA Department", "4", "Local Office");
        myCompany.AddDepartment(QADepartment);

        myCompany.getDepartments().stream()
                .filter(dept -> dept.getLocation() == "Local Office")
                .collect(Collectors.toList())
                .forEach((x) -> System.out.println(x.getName()));

        System.out.println("We provide following services");

        Service web_development = new DevelopmentService("Web Development", 1);
        Service mobile_development = new DevelopmentService("Mobile Development",2);
        Service qa_ba_service = new QAService("QA and Business Analysis Service",3);
        Service ui_service = new QAService("UI Design Service",4);
        Service project_management = new ProjectManagementService("Project Management Service",5);


        myCompany.AddService(web_development);
        myCompany.AddService(mobile_development);
        myCompany.AddService(qa_ba_service);
        myCompany.AddService(ui_service);
        myCompany.AddService(project_management);

        myCompany.GetAllServices()
                .forEach((x) ->  x.doWork());

        String inputFromUser = getUserInput("Please select the service that you want to hire from " + myCompany.getCompanyName() + ": ");
        Service selectedService = myCompany.GetAllServices().stream()
                .filter(x->Integer.toString(x.getServiceId())
                        .equals(inputFromUser)).findFirst().get();//.getServiceName();

        System.out.println("You selected: " + selectedService.getServiceName());
        int userHourlyRate = getUserInputAsNumber("What hourly rate do you offer? ");

        String userMessage = selectedService.getServiceName() + " will cost your around minimum $"+
                CostCalculator.MINIMUM_PROJECT_HOURS * userHourlyRate + " to $" +
                CostCalculator.MAXIMUM_PROJECT_HOURS * userHourlyRate;

        System.out.println("\n\n"+userMessage);

        MyThread myThread = new MyThread();
        myThread.start();


    }

    private static String getUserInput(String messageToShow){
        System.out.print(messageToShow);
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }
    private static int getUserInputAsNumber(String messageToShow){
        System.out.print(messageToShow);
        Scanner scn = new Scanner(System.in);
        return Integer.parseInt(scn.next());
    }

    public static ArrayList<String> readFileInList(String fileName) {
        ArrayList<String> lines = new ArrayList<>();// Collections.emptyList();
        try {
            lines = new ArrayList<String>(Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

}