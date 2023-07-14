package com.zimttech.healthy.common;

import java.util.List;
import java.util.Optional;

public interface AppService<T> {

    Optional<T> get(Object id);

    List<T> getAll(int page, int size);

    List<T> getAll();

    Optional<T> save(T t);

    Optional<T> update(T t);

    void delete(T t);

}