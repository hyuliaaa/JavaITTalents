package com.example.s13firstspringproject.controller;

import com.example.s13firstspringproject.exceptions.NotFoundException;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.nio.file.Files;

@RestController
public class FileController {

    @SneakyThrows
    @GetMapping("/files/{filename}")
    public void download(@PathVariable String filename, HttpServletResponse response){
        File f = new File("uploads" + File.separator + filename);
        if(!f.exists()){
            throw new NotFoundException("File does not exist");
        }
        Files.copy(f.toPath(), response.getOutputStream());
    }
}
