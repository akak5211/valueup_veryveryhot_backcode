package com.valueup.veryveryhot.Controller;

import com.valueup.veryveryhot.Service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;


/**
 * @author  INLAB_JiHun
 * @desc    AWS S3와 연동하여 Upload, Download, Delete 수행
 *
 * @ref AWS S3 Setting (1)      => https://victorydntmd.tistory.com/334
 * @ref AWS S3 Setting (2)      => https://charlie-choi.tistory.com/236
 * @ref AWS S3 Up/Down Load     => https://examples.javacodegeeks.com/spring-boot-and-aws-s3-download-file/
 * @ref AWS S3 Key 발급          => https://loy124.tistory.com/204
 */
@RequiredArgsConstructor
@RequestMapping("/")
@RestController
public class S3Controller {
    final private S3Service s3Service;


    @PostMapping("/post/single")
    public String postSingle(@RequestParam("file") MultipartFile file) throws IOException {
        return s3Service.upload("smart-village", file);
    }


    @PostMapping("/post/multi")
    public List<Map<String, String>> postMulti(@RequestParam("files") List<MultipartFile> files) throws IOException {

        List<Map<String, String>> urlMapList = new ArrayList<>();

        for(MultipartFile file : files) {
            String objUrl = s3Service.upload("smart-village", file);

            Map<String, String> urlMap = new HashMap<>();
            urlMap.put(file.getOriginalFilename(), objUrl);

            urlMapList.add(urlMap);
        }

        return urlMapList;
    }


    @GetMapping("/get/single")
    public ByteArrayResource getSingle(@RequestParam("file") String fileName) throws IOException {
        byte[] contents = s3Service.download("smart-village", fileName);
        return new ByteArrayResource(contents);
    }


    @DeleteMapping("/delete/single")
    public String deleteSingle(@RequestParam("file") String targetName) {
        s3Service.delete("smart-village", targetName);
        return "OK";
    }
}
