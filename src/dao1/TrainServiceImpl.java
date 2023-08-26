package dao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import entity.Train;
import servvice.TrainService;

public class TrainServiceImpl implements TrainService {

	Set<Train> setOfTrain=new TreeSet();
	@Override
	public boolean addTrain(Train train) {
		return   setOfTrain.add(train);
		
	}

	@Override
	public List<Train> viewTrains() {
		// TODO Auto-generated method stub
		List<Train> listOfTrain=new ArrayList(setOfTrain);
		return listOfTrain;
	}

	@Override
	public Train deleteTrain(int trainNumber) {
		for(Train t:setOfTrain) {
			int tno = t.getTarinNumber();
			if(tno==trainNumber) {
				setOfTrain.remove(t);
				return t;
			}
		}
		return null;
	}

	@Override
	public Train updateTrain(int Train, double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Train> searchTrain(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Train> sortTraininOrder() {
		// TODO Auto-generated method stub
		return null;
	}
}
