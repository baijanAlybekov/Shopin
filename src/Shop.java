import java.util.Arrays;

public class Shop {

    private Employee[]sotrudniki;
    private String name;
    private String namesait;
    private String tovar;

    public Shop(){

    }
    public Shop(Employee[]sotrudniki, String name, String namesait, String  tovar){
        this.sotrudniki=sotrudniki;
        this.name=name;
        this.namesait=namesait;
        this.tovar=tovar;
    }

    public Employee[] getSotrudniki() {
        return sotrudniki;
    }

    public void setSotrudniki(Employee[] sotrudniki) {
        this.sotrudniki = sotrudniki;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamesait() {
        return namesait;
    }

    public void setNamesait(String namesait) {
        this.namesait = namesait;
    }

    public String getTovar() {
        return tovar;
    }

    public void setTovar(String tovar) {
        this.tovar = tovar;
    }

    @Override
    public String toString() {
        return
                "sotrudniki=" + Arrays.toString(sotrudniki)+"\n" +
                ", name='" + name + '\'' +
                ", namesait='" + namesait + '\'' +
                ", tovar='" + tovar + '\'' +
                '}';
    }
}
