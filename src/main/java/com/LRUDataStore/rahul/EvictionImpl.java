package com.LRUDataStore.rahul;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EvictionImpl implements Eviction 
{
	DataStore datastore;
	private Map<Object, Integer> cache = new LinkedHashMap<>();
	private List<Object> frames = new ArrayList<>();
	static int count =0;
	private final int size = 4;
	
	public void setStore(DataStore datastore)
	{
		this.datastore = datastore;
	}
	
	public void add(Object key, Object value)
	{
		if(count < size)
		{
			if(cache.containsKey(key))
			{
				int index = cache.get(key);
				if(index != 0)
					frames.remove(index);
							
				frames.add(0, key);
			}
			else
			{
				frames.add(0, key);
				cache.put(key, 0);
				datastore.store(key, value);
			}
			count++;
		}
		else
		{
			Object rKey = frames.get(count-1);
			// if count is over, then remove from frames and add new frame at 0th index
			frames.remove(count-1);
			frames.add(0, key);
			// if count is over, then remove from cache and put new key with value (0th index)
			cache.remove(rKey);
			cache.put(key, 0);
			// if count is over, then remove from data Store and put new key with value (0th index)
			datastore.remove(rKey);
			datastore.store(key, value);
		}		
	}
	
	public Object get(Object key)
	{
		if(cache.containsKey(key))
		{
			Object value = datastore.getValue(key);			
			add(key, value); //update the data
			return value;
		}
		return null;
		
	}
}
