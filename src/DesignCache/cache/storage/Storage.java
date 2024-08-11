package DesignCache.cache.storage;

import DesignCache.cache.exceptions.NotFoundException;
import DesignCache.cache.exceptions.StorageFullException;

public interface Storage<Key, Value> {
    public void add(Key key, Value value) throws StorageFullException;

    void remove(Key key) throws NotFoundException;

    Value get(Key key) throws NotFoundException;
}
