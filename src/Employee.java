public class Employee {
    String name1;
    String rabota;
    public Employee(){

    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getRabota() {
        return rabota;
    }

    public void setRabota(String rabota) {
        this.rabota = rabota;
    }

    public Employee(String name1, String rabota) {
        this.name1 = name1;
        this.rabota = rabota;
    }

    @Override
    public String toString() {
        return
                 name1 ;
    }
}
