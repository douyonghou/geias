package com.gr.geias.service;

import org.springframework.web.multipart.MultipartFile;

public interface IDataFileService {
    boolean batchImport(String fileName, MultipartFile file) throws Exception;
}
