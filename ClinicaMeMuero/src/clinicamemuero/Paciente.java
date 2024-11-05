package clinicamemuero;

public class Paciente {

    //Variables clase paciente
    private String name;
    private String reason; //motivo de consuta

    //Constructor
    public Paciente(String name, String reason) {
        this.name = name;
        this.reason = reason;
    }

//Get and Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
