package com.code.classsystem.config;

import com.code.core.util.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.File;
@Configuration
public class FileRequestConfig {
    @Value("${system.fileUpload.url}")
    private String fileUploadUrl;

    public String getFileUploadUrl() {
        if(FileUtils.isRelativePath(fileUploadUrl)){
            File file = new File(fileUploadUrl);
            return file.getAbsolutePath();
        }

        return fileUploadUrl;
    }
}
