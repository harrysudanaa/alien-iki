package id.ac.undiksha.organization;
import id.ac.undiksha.siak.entities.*;

public class StudyProgram implements Department, Faculty {
	private String studyProgramCode;
	private String studyProgramName;
	
	public Lecturer coordinator = new Lecturer();
	
	public StudyProgram() {};
	public StudyProgram(String studyProgramCode, String studyProgramName) {
		super();
		this.studyProgramCode = studyProgramCode;
		this.studyProgramName = studyProgramName;
	}
	public String getStudyProgramCode() {
		return studyProgramCode;
	}
	public void setStudyProgramCode(String studyProgramCode) {
		this.studyProgramCode = studyProgramCode;
	}
	public String getStudyProgramName() {
		return studyProgramName;
	}
	public void setStudyProgramName(String studyProgramName) {
		this.studyProgramName = studyProgramName;
	}
	
	private String deptName;
	private String deptCode;
	
	@Override
	public void setDeptName(String deptName) {
		// TODO Auto-generated method stub
		this.deptName = deptName;
	}
	@Override
	public String getDeptName() {
		// TODO Auto-generated method stub
		return this.deptName;
	}
	@Override
	public void setDeptCode(String deptCode) {
		// TODO Auto-generated method stub
		this.deptCode = deptCode;
	}
	@Override
	public String getDeptCode() {
		// TODO Auto-generated method stub
		return this.deptCode;
	}
	@Override
	public String getFacName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
