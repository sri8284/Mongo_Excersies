package com.example.database;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class PersonRepo {

	private static MongoDatabase database =null;
	@SuppressWarnings("resource")
	public static MongoDatabase getMongoDatabase(){
		 
		if(database==null){
		   database = new MongoClient(new MongoClientURI("mongodb://localhost:27017")).getDatabase("local");
		}
		return database;
	}
	
	public static MongoCollection<Document> getMongoCollection(){
		return getMongoDatabase().getCollection("personData");
	}
	
	public void shutDown(){
		getMongoDatabase().drop();
	}
}
