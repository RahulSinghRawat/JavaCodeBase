package com.LRUDataStore.rahul;

public interface Eviction 
{
	public void add(Object key, Object value);
	public Object get(Object key);
	public void setStore(DataStore sObj);
}
