package com.LRUDataStore.rahul;

import java.util.HashMap;
import java.util.Map;

public class DefaultDatStore implements DataStore
{
	private Map<Object, Object> store = new HashMap<>();
	
	@Override
	public void store(Object key, Object value) 
	{
		store.put(key, value);
	}

	@Override
	public Object getValue(Object key) 
	{
		
		return store.get(key);
	}

	@Override
	public void remove(Object key)
	{
		store.remove(key);		
	}
}
