package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Result;
import in.ac.charusat.studentmgmtsystem.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResultController {

    @Autowired
    ResultRepository resultRepository;
    @GetMapping("/listResult")
    public List<Result> getAllResult (){
            return resultRepository.findAll();
    }

    @GetMapping("/result/{id")
    public Result getResult(@PathVariable Integer id){
    return resultRepository.findById(id).get();
    }

    @PostMapping("/result")
    public List<Result> addResult(@RequestBody Result result){
        resultRepository.save(result);
        return resultRepository.findAll();
    }
}
