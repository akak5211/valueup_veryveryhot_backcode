package com.valueup.veryveryhot.Service;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.IOUtils;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.IOException;



@PropertySource("classpath:aws.properties")
@Service
@NoArgsConstructor
public class S3Service {
    private AmazonS3 s3Client;

    @Value("${cloud.aws.credentials.accessKey}")
    private String accessKey;

    @Value("${cloud.aws.credentials.secretKey}")
    private String secretKey;

    @Value("${cloud.aws.s3.bucket}")
    private String bucket;

    @Value("${cloud.aws.region.static}")
    private String region;

    @PostConstruct
    public void setS3Client() {
        AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);

        s3Client = AmazonS3ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(this.region)
                .build();
    }




    /*
     * @func        upload file
     * @param       dirName : s3 directory name
     * @param       file : target file input stream
     *
     * @return      s3 object url
     **/
    public String upload(String dirName, MultipartFile file) throws IOException {
        String filePath = dirName + "/" + file.getOriginalFilename();

        s3Client.putObject(new PutObjectRequest(bucket, filePath, file.getInputStream(), null)
                .withCannedAcl(CannedAccessControlList.PublicRead));

        return s3Client.getUrl(bucket, filePath).toString();
    }




    /*
     * @func        download file
     * @param       dirName : s3 directory name
     * @param       targetFile : targetFile in s3 directory
     *
     * @return      file contents
     **/
    public byte[] download(String dirName, String targetFile) throws IOException {
        String filePath = dirName + "/" + targetFile;

        S3Object s3Object = s3Client.getObject(new GetObjectRequest(bucket, filePath));
        S3ObjectInputStream inputStream = s3Object.getObjectContent();
        byte[] contents = IOUtils.toByteArray(inputStream);
        s3Object.close();

        return contents;
    }




    /*
     * @func        delete file
     * @param       dirName : s3 directory name
     * @param       targetFile : targetFile in s3 directory
     *
     * @return      void
     **/
    public void delete(String dirName, String targetFile) {
        String filePath = dirName + "/" + targetFile;
        s3Client.deleteObject(new DeleteObjectRequest(bucket, filePath));
    }
}
