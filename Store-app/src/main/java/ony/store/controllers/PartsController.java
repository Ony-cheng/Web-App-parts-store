package ony.store.controllers;


import ony.store.dao.BrandDAO;
import ony.store.dao.PartDAO;
import ony.store.dao.PartDAOHibernate;
import ony.store.entities.Part;

import ony.store.entities.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parts")
public class PartsController {

    @Autowired
    private PartDAO partDAO;

    @Autowired
    private BrandDAO brandDAO;

    @PostMapping("/add")
    public void addPart(@RequestBody Part part){

        System.out.println("Nice! We got a ne part "+ part.getName());
        System.out.println("part created, id is " + partDAO.create(part));
        System.out.println(brandDAO.getAll().get(1).getName());

    }
}
