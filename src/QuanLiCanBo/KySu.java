package QuanLiCanBo;

public class KySu extends CanBo{

    private String technique;

    public KySu() {
    }

    public KySu(String name, int age, String gender, String address, String technique) {
        super(name, age, gender, address);
        this.technique = technique;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "technique='" + technique + '\'' +
                '}';
    }
}
