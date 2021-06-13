package Simplisafe.Class;

// Object to store events
public class Report {

    public Object device;
    public String instance;
    public String description;

    public Report(Object device, String instance, String description){
        this.device = device;
        this.instance = instance;
        this.description = description;
    }
}
