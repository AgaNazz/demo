package aaaaa;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FourWheeler fw = new FourWheeler("MARUTI", 800, 0, 1000);
			System.out.println(fw);
			fw.check();
			
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
		try {
						
			FourWheeler fw1 = new FourWheeler("mustank", 150, 0, 1100);
			System.out.println(fw1);
			fw1.check();
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
		try {
			
			FourWheeler fw2 = new FourWheeler("AUDI", 5000, 0, 1200);
			System.out.println(fw2);
			fw2.check();
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
		try {
			
			FourWheeler fw3 = new FourWheeler("SUZUKI", 1200, 5, 1300);
			System.out.println(fw3);
			fw3.check();
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
	}


	}


