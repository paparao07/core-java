package com.project;

public class GarbageCollectorDemo {

	
	    String name;

	    GarbageCollectorDemo(String name) {
	        this.name = name;
	    }

	    // This method is called before the object is destroyed
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println(name + " object is collected by Garbage Collector");
	    }

	    public static void main(String[] args) {

	        // Creating objects
	        GarbageCollectorDemo obj1 = new GarbageCollectorDemo("Object1");
	        GarbageCollectorDemo obj2 = new GarbageCollectorDemo("Object2");

	        // Making objects eligible for Garbage Collection
	        obj1 = null;
	        obj2 = null;

	        // Requesting Garbage Collector
	        System.gc();

	        System.out.println("End of main method");
	    }
	}