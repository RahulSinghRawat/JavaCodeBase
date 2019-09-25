package com.LRUCache.rahul;

import com.LRUDataStore.rahul.DataStoreImpl;
import com.LRUDataStore.rahul.EvictionImpl;

public class FlipCacheManager 
{
	
		public static void main(String[] args) 
		{
			FlipCache fc = new FlipCache();
		
			fc.configure(new DataStoreImpl(), new EvictionImpl()); // Configuring the DataStore and Eviction policy.
			
			fc.add("Hello", "greetings");
			fc.add("Flip", "cache");
			fc.add("Face", "Book");
			fc.add("Google", "Search");
			System.out.println(fc.get("Hello"));
			fc.add("Apple", "Iphone");
			
			
			System.out.println(fc.get("Face"));
			System.out.println(fc.get("Hello")); // Returns null if the key value doesn't present in the cache.
			System.out.println(fc.get("Flip"));
		}
}