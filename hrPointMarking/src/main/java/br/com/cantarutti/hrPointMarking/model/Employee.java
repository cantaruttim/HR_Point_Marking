package br.com.cantarutti.hrPointMarking.model;

public class Employee {
    
    private String Registration;
    private String Name;
    private String AdmissionDate;
    private String Departament;
    private String Level;
    private Integer LevelRole;
    private String Role;

    public Employee() {};

    public Employee(
        String registration, 
        String name, 
        String adminissionDate,
        String departement,
        String level,
        Integer levelRole,
        String role
    ) {
        this.Registration = registration;
        this.Name = name;
        this.AdmissionDate = adminissionDate;
        this.Departament = departement;
        this.Level = level;
        this.LevelRole = levelRole;
        this.Role = role;
    };

    public String getRegistration() {
        return this.Registration;
    }

    public void setRegistration(String Registration) {
        this.Registration = Registration;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAdmissionDate() {
        return this.AdmissionDate;
    }

    public void setAdmissionDate(String AdmissionDate) {
        this.AdmissionDate = AdmissionDate;
    }

    public String getDepartament() {
        return this.Departament;
    }

    public void setDepartament(String Departament) {
        this.Departament = Departament;
    }

    public String getLevel() {
        return this.Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public Integer getLevelRole() {
        return this.LevelRole;
    }

    public void setLevelRole(Integer LevelRole) {
        this.LevelRole = LevelRole;
    }

    public String getRole() {
        return this.Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
    
}
