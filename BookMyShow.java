class BookMyShow{

public static String validateAndBookTicket(long mobileNumber,String movieName,String theatreName,String seatType,String userName){

System.out.println("validateAndBookTicket method is started");

String bookingStatus=null;

if(mobileNumber!=0 && movieName!=null && theatreName!=null && seatType!=null && userName!=null){

    if(movieName.length()>3 && theatreName.length()>3 && userName.length()>3){

        bookingStatus="Hello "+userName+" Your ticket for "+movieName+" at "+theatreName+" is booked successfully";

    }else{

        bookingStatus="Please check the Movie Name, Theatre Name or User Name length";

    }

}else{

    bookingStatus="Please enter valid ticket booking data";

}

System.out.println("validateAndBookTicket method is Ended");

return bookingStatus;

}

}