package com.LRUCache.rahul;

import com.LRUDataStore.rahul.DataStore;
import com.LRUDataStore.rahul.Eviction;

public class FlipCache 
{
	private DataStore ds;
	private Eviction eviction;
	
	public DataStore getDs() {
		return ds;
	}

	private void setDs(DataStore ds) {
		this.ds = ds;
	}	

	private void setEviction(Eviction eviction) {
		this.eviction = eviction;
	}
	
	public void configure(DataStore ds, Eviction ev)
	{
		setDs(ds);
		setEviction(ev);
		ev.setStore(ds);
	}
	
	public void add(Object key, Object value)
	{
		eviction.add(key, value);
	}
	
	public Object get(Object key)
	{
		return eviction.get(key);
	}	
}
