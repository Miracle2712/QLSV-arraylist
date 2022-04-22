package QuanLiCanBo;

public interface QuanLy<P> {
    void add(P t);

    void display();

    void edit(String name, P p);

    void delete(String name);

    int findIndexByName(String name);


}
