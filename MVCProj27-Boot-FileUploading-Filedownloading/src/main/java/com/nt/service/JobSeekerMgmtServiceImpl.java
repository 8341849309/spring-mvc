package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.JobSeekerInfoRep;
import com.nt.entity.JobSeekerInfo;

@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {

	@Autowired
	private JobSeekerInfoRep dao;

	@Override
	public String registerJobSeeker(JobSeekerInfo info) {
		System.out.println("JobSeekerMgmtServiceImpl.registerJobSeeker()");

		JobSeekerInfo info1 = dao.save(info);

		if (info1 != null)
			return "JobSeeker is register with Id:: " + info1.getJsId();
		else
			return "Problem in JobSeeker Registration";
	}

	@Override
	public List<JobSeekerInfo> getAllFiles() {
		System.out.println("JobSeekerMgmtServiceImpl.getAllFiles()");

		List<JobSeekerInfo> list = (List<JobSeekerInfo>) dao.findAll();

		return list;
	}

}
