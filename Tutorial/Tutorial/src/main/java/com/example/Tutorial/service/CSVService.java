package com.example.Tutorial.service;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.Tutorial.model.tutorial;





public interface CSVService  {


  public void save(MultipartFile file);

  public List<tutorial> getAllTutorials();
}