package Simplisafe;


import Simplisafe.Class.Report;
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    // Off, Blue and Solid Red status
    private String LEDStatus;
    private BaseStation baseStation;
    private DataBase dataBase;

    public App(BaseStation theBaseStation, DataBase theDataBase){
        baseStation = theBaseStation;
        dataBase = theDataBase;
    }
    public void doThing(final String[] theArgs) {
        // Showing security status
        LEDStatus = baseStation.getLEDStatus();

        // Turning on security
        baseStation.setSystemStatus();
        baseStation.getSignalFromDevice("Application");

        // Turning off security
        baseStation.setSystemStatus();
        baseStation.turnLEDStatusOff();

        // Getting detection history
        LinkedList<Report> reportList = new LinkedList<>();
        Iterator itr = reportList.iterator();
        while(itr.hasNext()) {
            Report report = (Report) itr.next();
            System.out.println(report.instance);
            System.out.println(report.description);
        }
    }
}
