package com.example.Tutorial.service;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.Tutorial.helper.CSVHelper;
import com.example.Tutorial.model.tutorial;
import com.example.Tutorial.repostiory.TutorialRepository;





@Service
class ICSVService implements CSVService  {
  @Autowired
  TutorialRepository repository;

  public void save(MultipartFile file) {
    try {
      List<tutorial> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
      repository.saveAll(tutorials);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public List<tutorial> getAllTutorials() {
    return repository.findAll();
  }
}