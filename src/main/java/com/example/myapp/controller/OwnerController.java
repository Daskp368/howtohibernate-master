package com.example.myapp.controller;


import com.example.myapp.model.Owner;
import com.example.myapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




import java.util.List;


@RestController
@RequestMapping("/owners")
public class OwnerController {


    private final OwnerService ownerService;


    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @GetMapping
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }


    @GetMapping("/{id}")
    public Owner getOwnerById(@PathVariable("id") int id) {
        return ownerService.getOwnerById(id);
    }


    @PostMapping
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerService.createOwner(owner);
    }


    @PutMapping("/{id}")
    public Owner updateOwner(@PathVariable int id, @RequestBody Owner owner) {
        owner.setId(id);
        return ownerService.updateOwner(owner);
    }


    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable("id") int id) {
        ownerService.deleteOwner(id);
    }
}
