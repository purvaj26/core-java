class YouTubeRunner
{
	public static void main(String [] youtube)
	{
		YouTube tube=new YouTube();
		boolean log=tube.login("Purvajnayak","Purvaj@399");
		System.out.println(log);
		String msg=tube.login("PMS10@gmail.com","purvaj@33","12WesV");
		System.out.println(msg);
		String msg1=tube.search("Robert");
		System.out.println(msg1);
		String msg2=tube.search("Robert","Darshan");
		System.out.println(msg2);
	}
}