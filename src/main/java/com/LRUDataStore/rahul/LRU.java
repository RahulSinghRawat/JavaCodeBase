package com.LRUDataStore.rahul;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LRU implements Eviction 
{
	DataStore sObj;
	private Map<Object, Integer> cache = new LinkedHashMap<>();
	private List<Object> frames = new ArrayList<>();
	static int count =0;
	private final int size = 4;
	
	public void setStore(DataStore sObj)
	{
		this.sObj = sObj;
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
				sObj.store(key, value);
			}
			count++;
		}
		else
		{
			Object rKey = frames.get(count-1);
			frames.remove(count-1);
			frames.add(0, key);
			cache.remove(rKey);
			cache.put(key, 0);
			sObj.remove(rKey);
			sObj.store(key, value);
		}		
	}
	
	public Object get(Object key)
	{
		if(cache.containsKey(key))
		{
			Object value = sObj.getValue(key);			
			add(key, value); //update the data
			return value;
		}
		return null;
		
	}
}
