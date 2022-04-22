package QuanLiCanBo;

public class NhanVien extends  CanBo{

    private String job;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "job='" + job + '\'' +
                '}';
    }
}
