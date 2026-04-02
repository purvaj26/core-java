class Flipkart1 {
	 
    public boolean login(String userName, String psw){
		System.out.println("invoking login using userName:"+userName+" and psw:"+psw);
		String regUserName="Purvaj Ms";
        String regPsw="purv@123";
        boolean isLogin=false;

		if(userName.equals(regUserName) && psw.equals(regPsw)){
			isLogin=true;
		}
		return isLogin;
    }
  
    public String login(long phnum,int otp){
		System.out.println("invoking login using phone number:"+phnum+" otp:"+otp);

 		long regPhnum=7411324231L;
        int regOtp=1234;
        String message;

		if(phnum==regPhnum && otp==regOtp){
			message="Login Successful";
        }else{
		    message="Login Failed";
        }

        return message;
    }
  
    public String search(String headsetName){
	    System.out.println("invoking search headsetName:"+headsetName);

        String message="searched headset is available: "+headsetName;
        return message;
    }

    public String search(String headsetName,String brand){
        System.out.println("invoking search headsetName:"+headsetName+" brand:"+brand);

        String message="Headset:"+headsetName+" brand:"+brand+" is available";
        return message;
    }

    public String search(String headsetName,String brand,int price){
        System.out.println("invoking search headsetName:"+headsetName+" brand:"+brand+" price:"+price);

        String message="Headset:"+headsetName+" brand:"+brand+" under price:"+price+" is available";
        return message;
    }

    public String search(String headsetName,String brand,int price,String color){
        System.out.println("invoking search headsetName:"+headsetName+" brand:"+brand+" price:"+price+" color:"+color);

        String message="Headset:"+headsetName+" color:"+color+" is available";
        return message;
    }

    public String search(String headsetName,String brand,int price,String color,String type){
        System.out.println("invoking search headsetName:"+headsetName+" brand:"+brand+" price:"+price+" color:"+color+" type:"+type);

        String message="Headset:"+headsetName+" type:"+type+" is available";
        return message;
    }

}