package com.nt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.JobSeekerInfo;
import com.nt.model.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Controller
public class JobSeekerController {

	@Autowired
	private IJobSeekerMgmtService ser;
	
	@Autowired
	private ServletContext sc;

	@GetMapping("/upload")
	public String showUploadForm(@ModelAttribute JobSeeker js) {
		System.out.println("JobSeekerController.showUploadForm()");
		
		js.setJsQlfy("B-Tech");
		
		return "jobseeker_form";
	}

	@PostMapping("/upload")
	public String registerJobSeeker(@ModelAttribute JobSeeker js, Map<String, Object> map) throws Exception {
		System.out.println("JobSeekerController.registerJobSeeker()");
		
		File file = new File("E:/uploadStore");

		if (!file.exists())
			file.mkdir();

		// get names of uploaded files
		String photoFileName = js.getPhoto().getOriginalFilename();
		String resumeFileName = js.getResume().getOriginalFilename();

		// create input streams representing uploaded files
		InputStream photoIS = js.getPhoto().getInputStream();
		InputStream resumeIS = js.getResume().getInputStream();

		// create output streams
		OutputStream photoOS = new FileOutputStream(file.getAbsolutePath() + "/" + photoFileName);
		OutputStream resumeOS = new FileOutputStream(file.getAbsolutePath() + "/" + resumeFileName);

		// copy Content
		IOUtils.copy(photoIS, photoOS);
		IOUtils.copy(resumeIS, resumeOS);

		// close streams
		photoIS.close();
		resumeIS.close();
		photoOS.close();
		resumeOS.close();

		// prepare entity class object
		JobSeekerInfo info = new JobSeekerInfo();
		info.setJsName(js.getJsName());
		info.setJsQlfy(js.getJsQlfy());
		info.setPhotoPath(file.getAbsolutePath().replace('\\', '/') + "/" + photoFileName);
		info.setResumePath(file.getAbsolutePath().replace('\\', '/') + "/" + resumeFileName);

		// use service method
		String msg = ser.registerJobSeeker(info);

		map.put("fileName1", photoFileName);
		map.put("fileName2", resumeFileName);
		map.put("resultMsg", msg);

		return "result";
	}

	@GetMapping("/list_files")
	public String showFiles(Map<String, Object> map) {
		System.out.println("JobSeekerController.showFiles()");
		
		// use srerice
		List<JobSeekerInfo> list = ser.getAllFiles();
		// add as model attribute
		map.put("filesList", list);
		return "show_files";
	}

	@GetMapping("/download")
	public String downloadFile(@RequestParam("fname") String fileName, HttpServletResponse res) throws Exception {
		System.out.println("JobSeekerController.downloadFile()");
		
		// Locate the file usin java.io.File object
		File file = new File(fileName);
		// get the length of the file and make it as response content length
		res.setContentLengthLong((file.length()));
		// get MIME of the file make it response content type
		String mimeType = sc.getMimeType(fileName);
		res.setContentType(mimeType != null ? mimeType : "application/octet-stream");
		// give instruction to browser to make the recieved content as the downloadable
		// file
		res.addHeader("Content-Disposition", "attachment;fileName=" + file.getName());
		// create InputStream pointing to file
		InputStream is = new FileInputStream(file);
		// create OutputStream pointing to response obj
		OutputStream os = res.getOutputStream();
		// complete file copy process
		IOUtils.copy(is, os);
		// since response going to browser directly from handler method itself.. So
		// return null (do not take void)
		return null;
	}

}
