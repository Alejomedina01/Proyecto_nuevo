package models;

public class Cliente {

    private String name;
    private int id;
    private long celphone;
    private String career;
    private String birthdate;

    public Cliente(int id, String name){
        this.name = name;
        this.id = id;
    }

    public Cliente(int id, String name, long celphone, String career, String birthdate) {
        this.name = name;
        this.id = id;
        this.celphone = celphone;
        this.career = career;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCelphone() {
        return celphone;
    }

    public void setCelphone(long celphone) {
        this.celphone = celphone;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
