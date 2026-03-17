package com.servicefinder.repository;

import com.servicefinder.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

    List<Worker> findByServiceType(String serviceType);

    List<Worker> findByServiceTypeAndLocation(String serviceType, String location);

}