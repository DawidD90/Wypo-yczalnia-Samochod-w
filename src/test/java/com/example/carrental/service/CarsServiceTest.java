package com.example.carrental.service;

import com.example.carrental.model.CarStatus;
import com.example.carrental.model.CarsModel;
import com.example.carrental.repository.CarsRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarsServiceTest {
    @Mock
    private CarsRepository carsRepository;

    @InjectMocks
    private CarsService carsService;


    @Test
    public void createCarWhenAllPropertiesAreCorrect() {

        //given
        final CarsModel carsModel = new CarsModel();
        carsModel.setCarStatus(CarStatus.AVAIlABLE);
        carsModel.setMake("Toyota");
        carsModel.setModel("Aygo");
        carsModel.setMileage("500");
        carsModel.setColor("Blue");
        carsModel.setPrice("500/day");
        carsModel.setProductionYear("2020");
        //when
        when(carsRepository.save(carsModel)).thenReturn(carsModel);

        //then
        final CarsModel model = carsService.addCars(carsModel);
        Assertions.assertEquals("500", carsModel.getMileage());
        Assertions.assertEquals("Toyota", carsModel.getMake());
    }
}