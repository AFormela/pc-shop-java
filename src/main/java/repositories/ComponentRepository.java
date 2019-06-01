package repositories;

public interface ComponentRepository<T> {
    void create(T component);
    void update(T component);
    T findById(Class<T> clazz, long id);
}
