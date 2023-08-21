package servvice;
import java.util.List;
import java.util.Set;

import entity.Train;

public interface TrainService {

	//admin
	public boolean addTrain(Train train);
	public List<Train> viewTrains();
	public Train deleteTrain(int trainNumber);
	public Train updateTrain(int Train,double price);
	public Set<Train> searchTrain(String source, String destination);
	public List<Train> sortTraininOrder();
	
	
}