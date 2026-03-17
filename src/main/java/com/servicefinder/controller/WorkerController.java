package com.servicefinder.controller;

import com.servicefinder.model.Worker;
import com.servicefinder.service.WorkerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @PostMapping
    public Worker addWorker(@RequestBody Worker worker) {
        return workerService.saveWorker(worker);
    }

    @GetMapping
    public List<Worker> getWorkers(@RequestParam String serviceType) {
        return workerService.findByServiceType(serviceType);
    }

    @GetMapping("/search")
    public List<Worker> searchWorkers(
            @RequestParam String serviceType,
            @RequestParam String location) {

        return workerService.searchWorkers(serviceType, location);
    }
}