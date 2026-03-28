class Facebook{

public static String loginAndlogout(long mobilNumber,String pasw,String fullName,String userName){
System.out.println("loginAndlogout process is started");
String loginStatus=null;
if(mobilNumber !=0 ||  pasw!=null || fullName !=null || userName != null){

  if (pasw.length()>0 || fullName.length()>4 || userName.length()>4){

    loginStatus= "Thank you "+fullName+" login successfully";
  }else{

   loginStatus="pleace check the length of PSW,FullName,userName";
}
}else{

    loginStatus="pleace enter the valid Data";
}
 System.out.println("loginAndlogout Process is ended");

 return loginStatus;
}
}