public class Artist {
    private String name;
    private String nationality;
    private int age;
    private String specialty;


    public Artist (String name, String nationality, int age, String specialty){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.specialty = specialty;
    }

    public String getName(){
        return name;
    }

    public String getNationality(){
        return nationality;
    }

    public int getAge(){
        return age;
    }

    public String getSpecialty(){
        return specialty;
    }

    public void setName(){
        this.name = name;
    }

    public void setNationality(){
        this.nationality = nationality;
    }

    public void setAge (){
        this.age = age;
    }

    public void setSpecialty(){
        this.specialty = specialty;
    }

    public void displayInfo(){
        System.out.println("Artist name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }
}