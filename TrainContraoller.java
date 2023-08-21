package controler1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import entity.Station;
import entity.Train;
import servvice.TrainService;

public class TrainContraoller {

	public static void main(String[] args) {

TrainService service=new dao1.TrainServiceImpl();
		
Scanner scanner=new Scanner(System.in);
System.out.println("How many train do you wants to add in List");
int not=scanner.nextInt();
Set<Station> setOfStation=new LinkedHashSet<Station>();
for(int i=0; i<not; i++)
{
	System.out.println("Enter train number");
	int number=scanner.nextInt();
	System.out.println("Enter train name");
String tname=scanner.next();
System.out.println("Enter train source");
String tsrc=scanner.next();
System.out.println("Enter train dest");
String tdest=scanner.next();
System.out.println("Enter train price");
double tprice=scanner.nextDouble();
Station station=new Station();
System.out.println("Enter station code");
int code=scanner.nextInt();
System.out.println("enter the station name");
String name=scanner.next();
station.setStationCode(code);
station.setStationName(name);
setOfStation.add(station);

Train train=new Train(number,tname,tsrc,tdest,tprice,setOfStation);
if(service.addTrain(train))
{
	System.out.println(" "+ (i+1)+ " "+"Train added");
}	
}
//*******************//
// To delete the Train we have implement this code.
System.out.println("Enter tain no to delete");
int delno= scanner.nextInt();
Train tnoss=service.deleteTrain(delno);

System.out.println(tnoss.getTarinNumber()+ " " +"deleted");
//*******************//

//Implementation for get source and give destination.

System.out.println("give source");
String s1 = scanner.next();
System.out.println("give destination ");
String d1 = scanner.next();
  Set<Train> setNew= service.searchTrain(s1, d1);
  for(Train t:setNew)
  {
	  System.out.println(t.getTarinNumber() + " "+t.getTrainName() + " "+t.getTrainPrice());
  }
	}

}
