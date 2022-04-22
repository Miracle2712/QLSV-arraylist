package QLS;

public interface GaneralManage<T> {
    void add(T t);

    void edit(int id, T t);

    void delete(int id);

    int findIndexByName(String name);

    int findIndexById(int id);

    void printAll();
}
