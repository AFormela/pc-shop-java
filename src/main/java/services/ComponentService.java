package services;

public interface ComponentService<T> {
    void create(T component);
    void update(T component);
    T findById(long id);
}
