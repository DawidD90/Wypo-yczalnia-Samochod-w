package com.example.carrental.service;

import com.example.carrental.model.RentModel;
import com.example.carrental.model.ReservationModel;
import com.example.carrental.repository.RentRepository;
import com.example.carrental.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class ReservationService {

    private final ReservationRepository reservationRepository;


    public List<ReservationModel> getAllReservations(){
        return reservationRepository.findAll();
    }

    public void saveEditReservation(ReservationModel editReservation) { reservationRepository.save(editReservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    public void addReservation(ReservationModel reservationModel) {reservationRepository.save(reservationModel);
    }


}



