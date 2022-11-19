package ony.store.dao;

import ony.store.entities.Part;

import java.util.List;

public interface PartDAO {

    public int create(Part part);

    public List<Part> searchByName(String query);

    public Part gedById(int id);

    public void update(Part part);

    public void delete(int id);



}
