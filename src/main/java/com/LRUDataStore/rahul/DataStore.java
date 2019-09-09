package com.LRUDataStore.rahul;

public interface DataStore
{
	public void store(Object key, Object value);
	public Object getValue(Object key);
	public void remove(Object key);
}
