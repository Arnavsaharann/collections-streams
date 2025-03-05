package com.bridgelabz.generics.levelone;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    void processResume() {
        System.out.println("Processing resume for: " + roleName);
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}

class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    void addResume(T resume) {
        resumes.add(resume);
    }

    void processResumes() {
        for (T resume : resumes) {
            resume.processResume();
        }
    }

    static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.processResume();
        }
    }
}

public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        Resume<DataScientist> dsResumes = new Resume<>();

        SoftwareEngineer seResume = new SoftwareEngineer();
        DataScientist dsResume = new DataScientist();

        seResumes.addResume(seResume);
        dsResumes.addResume(dsResume);

        System.out.println("Individual Resume Processing");
        seResumes.processResumes();
        dsResumes.processResumes();

        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(seResume);
        allResumes.add(dsResume);

        System.out.println("Screening All Resumes Using Wildcards");
        Resume.screenResumes(allResumes);
    }
}
