package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Parkinglot;
import tws.repository.ParkinglotMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkinglots")
public class ParkinglotController {

    @Autowired
    private ParkinglotMapper parkinglotMapper;

    @GetMapping("")
    public ResponseEntity<List<Parkinglot>> getAll() {
        return ResponseEntity.ok(parkinglotMapper.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<Parkinglot> insert(@RequestBody Parkinglot parkinglot) {
    	parkinglotMapper.insert(parkinglot);
        return ResponseEntity.created(URI.create("/parkinglots/" + parkinglot.getId())).body(parkinglot);
    }
}

