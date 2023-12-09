package com.example.s3;


import java.util.List;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
public class AWS_Configuration {

	 public static void main(String[] args) {
	        String accessKeyId = "AKIAZKPOSUMIZL2RZX62";
	        String secretAccessKey = "ZBe/ULYispdw/IshPY7U4UlNUolHDV/MO5WtwXxo";
	        String region = "ap-south-1"; // For example, "us-west-1"

	        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKeyId, secretAccessKey);

	        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
	                                .withCredentials(new AWSStaticCredentialsProvider(credentials))
	                                .withRegion(region)
	                                .build();

	        // Perform operations with the S3 client
	        // For instance: list buckets, upload files, download files, etc.
	        List<Bucket> buckets = s3Client.listBuckets();
	        for (Bucket bucket : buckets) {
	            System.out.println("Bucket Name: " + bucket.getName());
	        }
	    }

}
