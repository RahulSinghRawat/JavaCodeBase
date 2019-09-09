package com.LRUCache.rahul;

import com.LRUDataStore.rahul.DefaultDatStore;
import com.LRUDataStore.rahul.LRU;

public class FlipCacheManager 
{
	
		public static void main(String[] args) 
		{
			FlipCache fc = new FlipCache();
		
			fc.configure(new DefaultDatStore(), new LRU()); // Configuring the DataStore and Eviction policy.
			
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