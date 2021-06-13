package Simplisafe;

import Simplisafe.Class.Detector;
import Simplisafe.Class.Report;
import Simplisafe.Class.Sensor;
import java.util.LinkedList;


// Stores current devices on a database to be added, removed, and displayed to an GUI
public class DataBase {

    // Our generated lists of all types stores on database
    LinkedList<Sensor> sensorList;
    LinkedList<Sensor> cameraList;
    LinkedList<Detector> detectorList;
    LinkedList<Report> reportList;

    //Generates our lists stores on database
    public DataBase() {

        sensorList = new LinkedList<>();
        cameraList = new LinkedList<>();
        detectorList = new LinkedList<>();
        reportList = new LinkedList<>();
    }

    // Generates and stores a report in database
    public void GenerateReport(Object Device, String timeOfInstance, String Description) {
        reportList.add(new Report(Device,timeOfInstance,Description));
    }

    // Returns a list of devices or reports based on request
    public LinkedList viewList(String typeOfList) throws Exception {

        if(typeOfList == "Sensor"){
            return sensorList;
        }
        else if(typeOfList == "Camera"){
            return cameraList;
        }
        else if(typeOfList == "Detector"){
            return detectorList;
        }
        else if(typeOfList == "Report"){
            return reportList;
        }
        throw new Exception("Type of list not found.");
    }


    // Removes a Sensor from the appropriate list
    public void removeDevice(Sensor Device) {
        sensorList.remove(Device);
    }

    // Removes a Sensor from the appropriate list
    public void addDevice(Sensor Device){
        sensorList.add(Device);
    }

    // Removes a Detector from the appropriate list
    public void removeDevice(Detector Device) {
        detectorList.remove(Device);
    }

    // Removes a Detector from the appropriate list
    public void addDevice(Detector Device){
        detectorList.add(Device);
    }

    // Allows the modification of a Sensor's status
    public void modifyDevice(Sensor newDevice, Sensor oldDevice){
        if(sensorList.contains(oldDevice)) {
            sensorList.remove(oldDevice);
            sensorList.add(newDevice);
        }
        else if(cameraList.contains(oldDevice)) {
            cameraList.remove(oldDevice);
            cameraList.add(newDevice);
        }
    }

    // Allows the modification of a Detector's status
    public void modifyDevice(Detector newDevice, Detector oldDevice){
        if(detectorList.contains(oldDevice)) {
            detectorList.remove(oldDevice);
            detectorList.add(newDevice);
        }
    }

}