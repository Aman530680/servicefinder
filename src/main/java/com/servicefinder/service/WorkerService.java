package com.servicefinder.service;

import com.servicefinder.model.Worker;
import com.servicefinder.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    // ADD worker
    public Worker saveWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    // GET by serviceType (THIS WAS MISSING)
    public List<Worker> findByServiceType(String serviceType) {
        return workerRepository.findByServiceType(serviceType);
    }

    // SEARCH by service + location
    public List<Worker> searchWorkers(String serviceType, String location) {
        return workerRepository.findByServiceTypeAndLocation(serviceType, location);
    }
}