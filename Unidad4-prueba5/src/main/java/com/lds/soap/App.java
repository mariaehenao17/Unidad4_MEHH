package com.lds.soap;

import java.rmi.RemoteException;
import com.lds.soap.GlobalWeatherStub; 

import com.lds.soap.GlobalWeatherStub.GetCitiesByCountry;
import com.lds.soap.GlobalWeatherStub.GetCitiesByCountryResponse;
import com.lds.soap.GlobalWeatherStub.GetWeather;
import com.lds.soap.GlobalWeatherStub.GetWeatherResponse;

public class App {

	public static void main(String[] args) throws RemoteException {
		GlobalWeatherStub globalWeatherStub=new  GlobalWeatherStub();
		GetCitiesByCountry getCitiesByCountry=new GetCitiesByCountry();
		getCitiesByCountry.setCountryName("Colombia");
		 
		GetCitiesByCountryResponse getCitiesByCountryResponse= globalWeatherStub
				.getCitiesByCountry (getCitiesByCountry);
		
		
		System.out.println(getCitiesByCountryResponse.getGetCitiesByCountryResult());
		
		
	GetWeather getWeather=new GetWeather();
	getWeather.setCityName("Manizales");
	getWeather.setCountryName("Colombia");
	GetWeatherResponse  getWeatherResponse= globalWeatherStub.getWeather(getWeather);
	
	System.out.println(getWeatherResponse.getGetWeatherResult());
	}

}
