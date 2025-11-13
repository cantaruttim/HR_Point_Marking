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
    
}
