package trainReservation.service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import trainReservation.dto.GetTrainListDto;
import trainReservation.entity.Cost;
import trainReservation.entity.Seat;
import trainReservation.entity.StopStation;
import trainReservation.entity.Train;

//service class(계층)
//실제 비즈니스 로직을 담당 
public class ReservationService {
	
	private static List<Train> trains = new ArrayList<>();
	private static List<Cost> costs = new ArrayList<>();
	private static DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm");
	
	
	public ReservationService() {
		initData();
	}
	
	public List<Train> getPossibleTrainList(GetTrainListDto dto, LocalTime departureTime){
		
		List<Train> possibleTrains = new ArrayList<>(); 
		
		for(Train train: trains) {
			
			List<StopStation> stopStations = train.getStopStations(); 
			int sameStationIndex = -1;
		
			
			boolean isPossible= true;
		
			for(int stopStationIndex = 0 ; stopStationIndex < stopStations.size() ; stopStationIndex++) {
				
				String stopStationName = stopStations.get(stopStationIndex).getStationName();
				
				if(!dto.isEqualDepartureStation(stopStationName)) {
					continue;							
				}
				
				LocalTime stationDepatureTime = LocalTime.parse(dto.getDepatureTime(),timeformatter);
			
				if(stationDepatureTime.isBefore(departureTime)) {
					
					break;
				}
				
				sameStationIndex = sameStationIndex;
				break; 
			}
			
			if(sameStationIndex == -1) {
				continue; 
			}
			
			for(int stopStationIndex = 0 ; stopStationIndex < stopStations.size(); stopStationIndex++) {
				
				String stationName = stopStations.get(stopStationIndex).getStationName();
				if(!dto.isEqualArrivalStation(stationName)) {
					continue; 
				}
				
				if(stopStationIndex <= sameStationIndex) {
					
					break;
				}
			
				possibleTrains.add(train);
				break;
			}
			
			List<Seat> seats = train.getSeats();
			
			int possibleSeatCount = 0;
			
			for(Seat seat : seats) {
				if(!seat.isSeatStatus()) {
					possibleSeatCount ++;
				}
			}
			
			if(possibleSeatCount < dto.getNumberOfPeople()) {
				continue;
			}
			
			possibleTrains.add(train);
		}
		
		return possibleTrains;
		
	}
	
	
private static void initData () {
		
		costs.add(new Cost("부산역", "서울역", 30000));
		costs.add(new Cost("부산역", "대전역", 20000));
		costs.add(new Cost("부산역", "대구역", 10000));
		costs.add(new Cost("대구역", "서울역", 20000));
		costs.add(new Cost("대구역", "대전역", 10000));
		costs.add(new Cost("대전역", "서울역", 10000));
		
		costs.add(new Cost("서울역", "부산역", 30000));
		costs.add(new Cost("서울역", "대전역", 10000));
		costs.add(new Cost("서울역", "대구역", 20000));
		costs.add(new Cost("대전역", "부산역", 20000));
		costs.add(new Cost("대구역", "부산역", 10000));
		costs.add(new Cost("대전역", "대구역", 10000));
		
		Train train;
		List<Seat>seats = new ArrayList<Seat>();
		List<StopStation> stopStations = new ArrayList<StopStation>();
		
		seats.add(new Seat(1,"A1,", false));
		seats.add(new Seat(1,"B1,", false));
		seats.add(new Seat(1,"A2,", false));
		seats.add(new Seat(1,"B2,", false));
		seats.add(new Seat(2,"A1,", false));
		seats.add(new Seat(2,"B1,", false));
		seats.add(new Seat(2,"A2,", false));
		seats.add(new Seat(2,"B2,", false));
		seats.add(new Seat(3,"A1,", false));
		seats.add(new Seat(3,"B1,", false));
		seats.add(new Seat(3,"A2,", false));
		seats.add(new Seat(3,"B2,", false));
		
		stopStations.add(new StopStation("서울역", "", "06:00"));
		stopStations.add(new StopStation("대전역", "06:45", "07:00"));
		stopStations.add(new StopStation("대구역", "07:45", "08:00"));
		stopStations.add(new StopStation("부산역", "09:00",""));
		
		
		train = new Train("KTX001", "서울역", "6:00", "부산역", "9:00", 180, "KTX", stopStations, seats);
		trains.add(train);
		
		seats = new ArrayList<Seat>();
		stopStations = new ArrayList<StopStation>();
		
		seats.add(new Seat(1,"A1,", false));
		seats.add(new Seat(1,"B1,", false));
		seats.add(new Seat(1,"A2,", false));
		seats.add(new Seat(1,"B2,", false));
		seats.add(new Seat(2,"A1,", false));
		seats.add(new Seat(2,"B1,", false));
		seats.add(new Seat(2,"A2,", false));
		seats.add(new Seat(2,"B2,", false));
		seats.add(new Seat(3,"A1,", false));
		seats.add(new Seat(3,"B1,", false));
		seats.add(new Seat(3,"A2,", false));
		seats.add(new Seat(3,"B2,", false));
		
		stopStations.add(new StopStation("부산역", "", "09:00"));
		stopStations.add(new StopStation("대구역", "09:45", "10:00"));
		stopStations.add(new StopStation("대전역", "10:45", "11:00"));
		stopStations.add(new StopStation("서울역", "12",""));
		
		train = new Train("KTX002", "부산역", "9:00", "서울역", "12:00", 180, "KTX", stopStations, seats);
		trains.add(train);

		
	
		
		
	}
	
	
	

}
