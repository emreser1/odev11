package com.singletonandbuilder;

public class Main {

	public static void main(String[] args) {
		
		VeritabaniBaglantisi baglantiSingleton = VeritabaniBaglantisi.getInstance();
		
		VeritabaniBaglantisi baglantiSingleton2 = VeritabaniBaglantisi.getInstance();

		if(baglantiSingleton == baglantiSingleton2)
			System.out.println("aynı nesne");

		
		VeritabaniBaglantisi baglanti = new VeritabaniBaglantisiBuilder()
			    .setHost("localhost")
			    .setPort("3306")
			    .setDatabase("test")
			    .setUsername("root")
			    .setPassword("password")
			    .build();
		
		System.out.println(" db : " + baglanti.getDatabase());
		System.out.println(" port : " + baglanti.getPort());
		System.out.println(" host : " + baglanti.getHost());
		System.out.println(" username : " + baglanti.getUsername());
		System.out.println(" password : " + baglanti.getPassword());



	
	}

}
