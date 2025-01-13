package io.backened.ipldashboard;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class IplDashboardApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(IplDashboardApplication.class, args);
		System.out.println("asad khan");
		if(10/0==0){
			System.out.println("aman khan");
		}
		int[] arr = new int[10];
		for(int i=0;i<11;i++)
		System.out.println(arr[i]);

	}
}
